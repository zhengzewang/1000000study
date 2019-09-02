package com.zzw.java1000000.z1126141.collection.collection;

public class EqualsObj {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == null ? false :
                ((obj instanceof EqualsObj) ? ((EqualsObj) obj).id.equals(this.id)
                        : false);
    }
}
