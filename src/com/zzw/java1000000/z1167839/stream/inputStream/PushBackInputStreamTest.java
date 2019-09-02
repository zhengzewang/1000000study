package com.zzw.java1000000.z1167839.stream.inputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;


/**
 * @author zhengzewang on 2019/4/22.
 */
public class PushBackInputStreamTest {

    public static void main(String[] args) throws IOException {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(new ByteArrayInputStream(new byte[]{'a', 'b', 'c', 'h', 'e', 'l', 'l', 'o'}));
        System.out.println(pushbackInputStream.markSupported());
        pushbackInputStream.unread('x');
        System.out.println(pushbackInputStream.available());
        //
        int read = pushbackInputStream.read();
        while (read != 'h') {
            read = pushbackInputStream.read();
        }
        pushbackInputStream.unread(read);
        read(pushbackInputStream);
    }

    private static void read(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        while (read != -1) {
            System.out.print((char) read);
            read = inputStream.read();
        }
    }

}
