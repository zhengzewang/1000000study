package com.zzw.java1000000.z1167839.stream.outputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author zhengzewang on 2019/5/21.
 */
public class ObjectOutputStreamTest {

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // 默认size=32
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        //
    }

}
