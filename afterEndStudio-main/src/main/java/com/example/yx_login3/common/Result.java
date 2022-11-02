package com.example.yx_login3.common;

import lombok.Data;

/**
 * @auther 陈镇川
 * @date 2022/11/2 16:44
 * @QQ 1026551395
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Result() {
        super();
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}