package com.zzw.java1000000.z1167839.stream.reader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * @author zhengzewang on 2019/5/25.
 */
public class LineNumberReaderTest {

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[]{'a', 'b', '\n', 'c', 'd', '\n', 'e', 'f', '\n', 'g', 'h', '\n', 'i'});
        InputStreamReader inputStreamReader = new InputStreamReader(byteArrayInputStream);
        LineNumberReader lineNumberReader = new LineNumberReader(inputStreamReader);
        //
        System.out.println(lineNumberReader.markSupported()); // true
        System.out.println(lineNumberReader.getLineNumber()); // 0
        System.out.println(lineNumberReader.readLine()); // ab
        System.out.println(lineNumberReader.getLineNumber()); // 1
        lineNumberReader.setLineNumber(3);
        System.out.println(lineNumberReader.getLineNumber()); // 3
        System.out.println(lineNumberReader.readLine()); // cd
        System.out.println(lineNumberReader.getLineNumber()); // 4
    }

}
