package com.zzw.java1000000.z1167839.stream.reader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

/**
 * @author zhengzewang on 2019/5/26.
 */
public class PushbackReaderTest {

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[]{'a', 'b', 'c', 'd', 'e'});
        InputStreamReader inputStreamReader = new InputStreamReader(byteArrayInputStream);
        PushbackReader pushbackReader = new PushbackReader(inputStreamReader, 3);
        //
        System.out.println(pushbackReader.markSupported());
        pushbackReader.unread(97);
        pushbackReader.unread(0xffff);
        pushbackReader.unread(0xffff + 1);
        System.out.println((char) pushbackReader.read());
        System.out.println((char) pushbackReader.read());
        System.out.println((char) pushbackReader.read());
        pushbackReader.unread(97);
        pushbackReader.close();
    }

}
