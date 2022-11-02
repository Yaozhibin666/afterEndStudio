package com.example.yx_login3.Utils;

import com.example.yx_login3.common.Result;
import com.example.yx_login3.common.ResultEnum;

/**
 * @auther 陈镇川
 * @date 2022/11/2 17:01
 * @QQ 1026551395
 */
public class ResultUtil {

    /**成功且带数据**/
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }
    /**成功但不带数据**/
    public static Result success(){

        return success(null);
    }
    /**失败**/
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}