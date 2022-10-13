package com.zls.zzz.service;

import com.zls.zzz.entity.News;

import java.util.List;

/**
 * @auther 陈镇川
 * @date 2022/10/3 15:09
 * @QQ 1026551395
 */
public interface NewsService {
    /**
     * 新增
     *
     * @param news
     * @return
     */
    public Boolean newsAdd(News news);

    /**
     * 删除
     *
     * @param ID
     * @return
     */
    public Boolean newsDel(Integer ID);

    /**
     * 修改
     *
     * @param news
     * @return
     */
    public Boolean newsEdit(News news);

    /**
     * 查询所有
     *
     * @return
     */
    public List<News> newsFindAll() ;

    /**
     * 查询单条
     *
     * @param ID
     * @return
     */
    public News newsFindOne(Integer ID);

    /**
     * 查询置顶新闻
     *
     * @param INDEX
     * @return
     */
    public News newsFindNo(Integer INDEX);
}
