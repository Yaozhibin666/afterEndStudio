package com.example.yx_login3.controller;

import com.example.yx_login3.entity.Form;
import com.example.yx_login3.service.FormService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Boolean formAdd(Form form) {
        System.out.println(form.getPROJECT());
        return formService.formAdd(form);
    }

    /**
     * 删除
     *
     * @param ID
     * @return
     */
    @ApiOperation(value = "删除对象")
    @DeleteMapping("/formDel/{ID}")
    public Boolean formDel(@PathVariable Integer ID) {
        return formService.formDel(ID);
    }

    /**
     * 修改
     *
     * @param form
     * @return
     */
    @ApiOperation(value = "修改对象")
    @PostMapping("/formEdit")
    public Boolean formEdit(Form form) {
        return formService.formEdit(form);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @ApiOperation(value = "查询所有")
    @GetMapping("/formFindAll")
    public List<Form> formFindAll() {
        return formService.formFindAll();
    }

    /**
     * 查询新闻页单条
     *
     * @param ID
     * @return
     */
    @ApiOperation(value = "查询对象")
    @GetMapping("/formFindOne/{ID}")
    public Form formFindOne(@PathVariable Integer ID) {
        return formService.formFindOne(ID);
    }

}
