package com.example.yx_login3.mapper;

import com.example.yx_login3.entity.Form;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @auther 陈镇川
 * @date 2022/10/3 12:38
 * @QQ 1026551395
 */
@Mapper
public interface FormMapper {
    /**
     * 新增
     *
     * @param form
     * @return
     */
    Boolean formAdd(Form form);

    /**
     * 删除
     *
     * @param ID
     * @return
     */
    Boolean formDel(Integer ID);

    /**
     * 修改
     *
     * @param form
     * @return
     */
    Boolean formEdit(Form form);

    /**
     * 查询所有
     *
     * @return
     */
    List<Form> formFindAll();

    /**
     * 查询单条
     *
     * @param ID
     * @return
     */
    Form formFindOne (Integer ID);

}
