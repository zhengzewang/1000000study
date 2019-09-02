package com.zzw.java1000000.z1167839.stream.inputStream.object;

import java.io.Serializable;

/**
 * @author zhengzewang on 2019/4/24.
 */
public class User implements Serializable {

    private String id;
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
        return "id：" + id + "，name：" + name;
    }
}
