package com.example.yx_login3.controller;

import com.example.yx_login3.entity.News;
import com.example.yx_login3.service.NewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Boolean newsAdd(News news) {
        return newsService.newsAdd(news);
    }

    /**
     * 删除
     *
     * @param ID
     * @return
     */
    @ApiOperation(value = "删除对象")
    @DeleteMapping("/newsDel/{ID}")
    public Boolean newsDel(@PathVariable Integer ID) {
        return newsService.newsDel(ID);
    }

    /**
     * 修改
     *
     * @param news
     * @return
     */
    @ApiOperation(value = "修改对象")
    @PostMapping("/newsEdit")
    public Boolean newsEdit(News news) {
        return newsService.newsEdit(news);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @ApiOperation(value = "查询所有")
    @GetMapping("/newsFindAll")
    public List<News> newsFindAll() {
        return newsService.newsFindAll();
    }

    /**
     * 查询新闻页单条
     *
     * @param ID
     * @return
     */
    @ApiOperation(value = "查询对象")
    @GetMapping("/newsFindOne/{ID}")
    public News newsFindOne(@PathVariable Integer ID) {
        return newsService.newsFindOne(ID);
    }

    /**
     * 查询新闻页置顶
     *
     * @param INDEX
     * @return
     */
    @ApiOperation(value = "查询置顶")
    @GetMapping("/newsFindNo/{INDEX}")
    public News newsFindNo(@PathVariable Integer INDEX) {
        return newsService.newsFindNo(INDEX);
    }
}
