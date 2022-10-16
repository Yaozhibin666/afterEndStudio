package com.example.yx_login3.service.NewsServiceImp;

import com.example.yx_login3.service.NewsService;
import com.example.yx_login3.entity.News;
import com.example.yx_login3.mapper.NewsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther 陈镇川
 * @date 2022/10/3 15:06
 * @QQ 1026551395
 */
@Service
public class NewsServiceImp  implements NewsService {

    @Resource
    private NewsMapper newsMapper;

    /**
     * 新增
     *
     * @param news
     * @return
     */
    public Boolean newsAdd(News news) {
        return newsMapper.newsAdd(news);
    }

    /**
     * 删除
     *
     * @param ID
     * @return
     */
    public Boolean newsDel(Integer ID) {
        return newsMapper.newsDel(ID);
    }

    /**
     * 修改
     *
     * @param news
     * @return
     */
    public Boolean newsEdit(News news) {
        return newsMapper.newsEdit(news);
    }

    /**
     * 查询所有
     *
     * @return
     */
    public List<News> newsFindAll() {
        return newsMapper.newsFindAll();
    }

    /**
     * 查询单条
     *
     * @param ID
     * @return
     */
    public News newsFindOne(Integer ID) {
        return newsMapper.newsFindOne(ID);
    }
    /**
     * 查询置顶新闻
     *
     * @param INDEX
     * @return.
     */
    public News newsFindNo(Integer INDEX) {
        return newsMapper.newsFindNo(INDEX);
    }
}
