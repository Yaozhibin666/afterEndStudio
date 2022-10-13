package com.zls.zzz.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Arrays;
import java.util.Date;

/**
 * @auther 陈镇川
 * @date 2022/10/3 14:57
 * @QQ 1026551395
 */
public class News {
    private Integer ID;
    private Integer INDEX;
    private String TITLE;
    private String COVER_PATH;
    private String CONTENE;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") //返回时间类型
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") //接收时间类型
    private Date TIME;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getINDEX() {
        return INDEX;
    }

    public void setINDEX(Integer INDEX) {
        this.INDEX = INDEX;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getCOVER_PATH() {
        return COVER_PATH;
    }

    public void setCOVER(String COVER_PATH) {
        this.COVER_PATH = COVER_PATH;
    }

    public String getCONTENE() {
        return CONTENE;
    }

    public void setCONTENE(String CONTENE) {
        this.CONTENE = CONTENE;
    }

    public Date getTIME() {
        return TIME;
    }

    public void setTIME(Date TIME) {
        this.TIME = TIME;
    }

    public News(Integer ID, Integer INDEX, String TITLE, String COVER_PATH, String CONTENE, Date TIME) {
        this.ID = ID;
        this.INDEX = INDEX;
        this.TITLE = TITLE;
        this.COVER_PATH = COVER_PATH;
        this.CONTENE = CONTENE;
        this.TIME = TIME;
    }

    public News() { }

    @Override
    public String toString() {
        return "News{" +
                "ID=" + ID +
                ", INDEX=" + INDEX +
                ", TITLE='" + TITLE + '\'' +
                ", COVER=" + COVER_PATH +
                ", CONTENE='" + CONTENE + '\'' +
                ", TIME=" + TIME +
                '}';
    }
}
