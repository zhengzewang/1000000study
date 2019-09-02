package com.zzw.java1000000.z1167839.stream.inputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;

/**
 * @author zhengzewang on 2019/4/9.
 * <p>
 * 缓冲流
 */
public class StringBufferInputStreamTest {

    public static void main(String[] args) throws IOException {
        StringBufferInputStream stringBufferInputStream = new StringBufferInputStream("abc");
        read(stringBufferInputStream);
    }

    public static void read(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        while (i != -1) {
            System.out.println((char) i);
            i = inputStream.read();
        }
    }

}
