package com.example.yx_login3.controller;

import com.example.yx_login3.Utils.ResultUtil;
import com.example.yx_login3.common.Result;
import com.example.yx_login3.common.ResultEnum;
import com.example.yx_login3.entity.Form;
import com.example.yx_login3.service.FormService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @auther 陈镇川
 * @date 2022/10/3 13:30
 * @QQ 1026551395
 */


@RestController
@Api(tags = "表单管理")
@CrossOrigin
@RequestMapping("/form")
@ResponseBody
public class FormController {

    @Autowired
    private FormService formService;

    /**
     * 新增
     *
     * @param form
     * @return boolean
     */
    @ApiOperation(value = "新增对象")
    @PostMapping("/formAdd")
    public Result formAdd(Form form) {
        System.out.println(form.getPROJECT());
        if(formService.formAdd(form))
            return ResultUtil.success(formService.formAdd(form));
        else
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(), ResultEnum.UNKNOWN_ERROR.getMsg());
    }

    /**
     * 删除
     *
     * @param ID
     * @return
     */
    @ApiOperation(value = "删除对象")
    @DeleteMapping("/formDel/{ID}")
    public  Result formDel(@PathVariable Integer ID) {
        if(formService.formDel(ID))
        return ResultUtil.success(formService.formDel(ID));
        else
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(), ResultEnum.UNKNOWN_ERROR.getMsg());
    }

    /**
     * 修改
     *
     * @param form
     * @return
     */
    @ApiOperation(value = "修改对象")
    @PostMapping("/formEdit")
    public Result formEdit(Form form) {
        if(formService.formEdit(form))
            return ResultUtil.success(formService.formEdit(form));
        else
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(), ResultEnum.UNKNOWN_ERROR.getMsg());
    }

    /**
     * 查询所有
     *
     * @return
     */
    @ApiOperation(value = "查询所有")
    @GetMapping("/formFindAll")
    public Result formFindAll() {
        return ResultUtil.success(formService.formFindAll());
    }

    /**
     * 查询新闻页单条
     *
     * @param ID
     * @return
     */
    @ApiOperation(value = "查询对象")
    @GetMapping("/formFindOne/{ID}")
    public Result formFindOne(@PathVariable Integer ID) {
        return ResultUtil.success(formService.formFindOne(ID));
    }

}
