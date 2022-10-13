package com.zls.zzz.mapper;

import com.zls.zzz.entity.News;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @auther 陈镇川
 * @date 2022/10/3 15:03
 * @QQ 1026551395
 */
@Mapper
public interface NewsMapper {

    /**
     * 新增
     *
     * @param news
     * @return
     */
    Boolean newsAdd(News news);

    /**
     * 删除
     *
     * @param ID
     * @return
     */
    Boolean newsDel(Integer ID);

    /**
     * 修改
     *
     * @param news
     * @return
     */
    Boolean newsEdit(News news);

    /**
     * 查询所有
     *
     * @return
     */
    List<News> newsFindAll();

    /**
     * 查询单条
     *
     * @param ID
     * @return
     */
    News newsFindOne (Integer ID);

    /**
     * 查询新闻页置顶
     *
     * @param INDEX
     * @return
     */
    News newsFindNo(Integer INDEX);
}
