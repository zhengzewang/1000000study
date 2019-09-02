package com.zzw.java1000000.z1167839.stream.outputStream.filter;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author zhengzewang on 2019/5/10.
 */
public class BufferedOutputStreamTest {

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // 默认size=32
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream,4);
        //
        bufferedOutputStream.write(new byte[]{'a','b','c'});
        System.out.println(byteArrayOutputStream.toString());
        bufferedOutputStream.flush();
        System.out.println(byteArrayOutputStream.toString());
    }

}
