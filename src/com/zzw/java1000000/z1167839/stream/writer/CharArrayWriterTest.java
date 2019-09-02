package com.zzw.java1000000.z1167839.stream.writer;

import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * @author zhengzewang on 2019/5/26.
 */
public class CharArrayWriterTest {

    public static void main(String[] args) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write("为实现中华民族伟大复兴的中国梦不懈奋斗");
        System.out.println(charArrayWriter.toString());
    }

}
