package com.zzw.java1000000.z1196687.jdbc;

/**
 * @author zhengzewang on 2019/7/20.
 */
public class Student {

    public final static String ID = "id";
    public final static String CODE = "code";
    public final static String NAME = "name";

    private String id;
    private String code;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id：" + id + "，code：" + code + "，name：" + name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
