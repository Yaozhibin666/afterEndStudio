package com.zls.zzz.entity;

/**
 * @auther 陈镇川
 * @date 2022/10/3 12:32
 * @QQ 1026551395
 */
public class Form {
    private Integer ID;
    private String NAME;
    private String EMAIL;
    private String PHONE;
    private String PROJECT;
    private String TEXT;
    private Integer read;

    public Form(String NAME, String EMAIL, String PHONE, String PROJECT, String TEXT, Integer read) {
        this.NAME = NAME;
        this.EMAIL = EMAIL;
        this.PHONE = PHONE;
        this.PROJECT = PROJECT;
        this.TEXT = TEXT;
        this.read = read;
    }

    public Form(Integer ID, String NAME, String EMAIL, String PHONE, String PROJECT, String TEXT, Integer read) {
        this.ID = ID;
        this.NAME = NAME;
        this.EMAIL = EMAIL;
        this.PHONE = PHONE;
        this.PROJECT = PROJECT;
        this.TEXT = TEXT;
        this.read = read;
    }

    public Form(){}

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getPROJECT() {
        return PROJECT;
    }

    public void setPROJECT(String PROJECT) {
        this.PROJECT = PROJECT;
    }

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public Integer getRead() {
        return read;
    }

    public void setRead(Integer read) {
        this.read = read;
    }

    @Override
    public String toString() {
        return "Form{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", PHONE='" + PHONE + '\'' +
                ", PROJECT='" + PROJECT + '\'' +
                ", TEXT='" + TEXT + '\'' +
                ", read=" + read +
                '}';
    }
}
