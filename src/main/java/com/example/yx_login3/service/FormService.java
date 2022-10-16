package com.example.yx_login3.service;

import com.example.yx_login3.entity.Form;

import java.util.List;

/**
 * @auther 陈镇川
 * @date 2022/10/3 12:38
 * @QQ 1026551395
 */
public interface FormService {
    /**
     * 新增
     *
     * @param form
     * @return
     */
    public Boolean formAdd(Form form);

    /**
     * 删除
     *
     * @param ID
     * @return
     */
    public Boolean formDel(Integer ID);

    /**
     * 修改
     *
     * @param form
     * @return
     */
    public Boolean formEdit(Form form);

    /**
     * 查询所有
     *
     * @return
     */
    public List<Form> formFindAll() ;

    /**
     * 查询单条
     *
     * @param ID
     * @return
     */
    public Form formFindOne(Integer ID);
}
