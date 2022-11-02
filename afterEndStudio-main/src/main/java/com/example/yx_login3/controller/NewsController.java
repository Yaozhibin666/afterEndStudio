package com.example.yx_login3.controller;

import com.example.yx_login3.Utils.ResultUtil;
import com.example.yx_login3.common.Result;
import com.example.yx_login3.common.ResultEnum;
import com.example.yx_login3.entity.News;
import com.example.yx_login3.service.NewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @auther 陈镇川
 * @date 2022/10/3 15:19
 * @QQ 1026551395
 */

@RestController
@Api(tags = "新闻页管理")
@CrossOrigin
@RequestMapping("/news")
@ResponseBody
public class NewsController {

    @Autowired
    private NewsService newsService;


    /**
     * 新增
     *
     * @param news
     * @return boolean
     */
    @ApiOperation(value = "新增对象")
    @PostMapping("/newsAdd")
    public Result newsAdd(News news) {
        if(newsService.newsAdd(news))
            return ResultUtil.success(newsService.newsAdd(news));
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
    @DeleteMapping("/newsDel/{ID}")
    public Result newsDel(@PathVariable Integer ID) {
        if(newsService.newsDel(ID))
            return ResultUtil.success(newsService.newsDel(ID));
        else
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(), ResultEnum.UNKNOWN_ERROR.getMsg());
    }

    /**
     * 修改
     *
     * @param news
     * @return
     */
    @ApiOperation(value = "修改对象")
    @PostMapping("/newsEdit")
    public Result newsEdit(News news) {
        if(newsService.newsEdit(news))
            return ResultUtil.success(newsService.newsEdit(news));
        else
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(), ResultEnum.UNKNOWN_ERROR.getMsg());
    }

    /**
     * 查询所有
     *
     * @return
     */
    @ApiOperation(value = "查询所有")
    @GetMapping("/newsFindAll")
    public Result newsFindAll() {
            return ResultUtil.success(newsService.newsFindAll());

    }

    /**
     * 查询新闻页单条
     *
     * @param ID
     * @return
     */
    @ApiOperation(value = "查询对象")
    @GetMapping("/newsFindOne/{ID}")
    public Result newsFindOne(@PathVariable Integer ID) {

            return ResultUtil.success(newsService.newsFindOne(ID));

    }

    /**
     * 查询新闻页置顶
     *
     * @param INDEX
     * @return
     */
    @ApiOperation(value = "查询置顶")
    @GetMapping("/newsFindNo/{INDEX}")
    public Result newsFindNo(@PathVariable Integer INDEX) {
        return ResultUtil.success(newsService.newsFindNo(INDEX));
    }
}
