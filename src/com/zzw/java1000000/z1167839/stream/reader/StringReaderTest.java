package com.zzw.java1000000.z1167839.stream.reader;

import java.io.IOException;
import java.io.StringReader;

/**
 * @author zhengzewang on 2019/5/25.
 */
public class StringReaderTest {

    public static void main(String[] args) throws IOException {
        StringReader stringReader = new StringReader("郑泽旺");
        System.out.println(stringReader.markSupported()); // true
        System.out.println((char) stringReader.read()); // 郑
        stringReader.close();
    }

}
