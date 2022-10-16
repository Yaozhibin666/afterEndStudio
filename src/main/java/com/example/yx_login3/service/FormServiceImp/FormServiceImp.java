package com.example.yx_login3.service.FormServiceImp;

import com.example.yx_login3.entity.Form;
import com.example.yx_login3.mapper.FormMapper;
import com.example.yx_login3.service.FormService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther 陈镇川
 * @date 2022/10/3 12:39
 * @QQ 1026551395
 */
@Service
public class FormServiceImp implements FormService {


    @Resource
    private FormMapper formMapper;

    /**
     * 新增
     *
     * @param form
     * @return
     */
    public Boolean formAdd(Form form) {
        if (form.getPHONE().length()!=11){
            System.out.println("手机号码错误");
            return false;
        }else {
            return formMapper.formAdd(form);
        }
    }

    /**
     * 删除
     *
     * @param ID
     * @return
     */
    public Boolean formDel(Integer ID) {
        return formMapper.formDel(ID);
    }

    /**
     * 修改
     *
     * @param form
     * @return
     */
    public Boolean formEdit(Form form) {
        return formMapper.formEdit(form);
    }

    /**
     * 查询所有
     *
     * @return
     */
    public List<Form> formFindAll() {
        return formMapper.formFindAll();
    }

    /**
     * 查询单条
     *
     * @param ID
     * @return
     */
    public Form formFindOne(Integer ID) {
        return formMapper.formFindOne(ID);
    }
}
