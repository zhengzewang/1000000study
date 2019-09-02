package com.zzw.java1000000.z1167839.stream.writer;

import java.io.IOException;
import java.io.StringWriter;

/**
 * @author zhengzewang on 2019/5/26.
 */
public class StringWriterTest {

    public static void main(String[] args) throws IOException {
        StringWriter stringWriter = new StringWriter();
        stringWriter.write("为实现中华民族伟大复兴的中国梦不懈奋斗");
        System.out.println(stringWriter.toString());
        System.out.println(stringWriter.getBuffer());
        stringWriter.flush();
        stringWriter.close();
    }

}
