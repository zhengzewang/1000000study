package com.zzw.java1000000.z1126141.collection.collection;

public class HashCodeObj {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
}
