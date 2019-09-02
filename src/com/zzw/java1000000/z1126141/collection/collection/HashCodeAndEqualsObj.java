package com.zzw.java1000000.z1126141.collection.collection;

public class HashCodeAndEqualsObj {

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

    @Override
    public boolean equals(Object obj) {
        return obj == null ? false :
                ((obj instanceof HashCodeAndEqualsObj) ? ((HashCodeAndEqualsObj) obj).id.equals(this.id)
                        : false);
    }

}
