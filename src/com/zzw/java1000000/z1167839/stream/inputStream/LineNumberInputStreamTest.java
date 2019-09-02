package com.zzw.java1000000.z1167839.stream.inputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberInputStream;

/**
 * @author zhengzewang on 2019/4/21.
 */
public class LineNumberInputStreamTest {

    public static void main(String[] args) throws IOException {
        LineNumberInputStream lineNumberInputStream = new LineNumberInputStream(new ByteArrayInputStream(new byte[]{'\n', '\n', '\n', '\n', '\r', '\n', '\r', '\n'}));
        read(lineNumberInputStream);
    }

    private static void read(LineNumberInputStream lineNumberInputStream) throws IOException {
        System.out.println(lineNumberInputStream.getLineNumber());
        int read = lineNumberInputStream.read();
        while (read != -1) {
            System.out.println((char) read);
            System.out.println(lineNumberInputStream.getLineNumber());
            read = lineNumberInputStream.read();
        }
    }

    private static void read(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        while (read != -1) {
            System.out.println((char) read);
            read = inputStream.read();
        }
    }

}
