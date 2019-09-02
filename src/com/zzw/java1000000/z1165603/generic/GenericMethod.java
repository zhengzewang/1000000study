package com.zzw.java1000000.z1165603.generic;

/**
 * @author zhengzewang on 2019/3/30.
 */
public class GenericMethod {

    private Object object;

    public <K> GenericMethod(K k) {
        this.object = k;
    }

    public <V> V fun(Class<V> cls) throws IllegalAccessException, InstantiationException {
        return cls.newInstance();
    }

}
