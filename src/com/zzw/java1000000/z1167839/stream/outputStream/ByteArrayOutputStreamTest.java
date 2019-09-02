package com.zzw.java1000000.z1167839.stream.outputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author zhengzewang on 2019/4/25.
 */
public class ByteArrayOutputStreamTest {

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // 默认size=32
        byteArrayOutputStream.write('a');
        byteArrayOutputStream.write(new byte[]{'b','c'});
        byteArrayOutputStream.write(new byte[]{'d','e','f','g'},1,2);
        byteArrayOutputStream.flush(); // 什么都不做
        byteArrayOutputStream.close(); // 什么都不做
        System.out.println(byteArrayOutputStream.toString());
        System.out.println(Arrays.toString(byteArrayOutputStream.toByteArray()));
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write('a');
        System.out.println(byteArrayOutputStream.toString());
    }

}
