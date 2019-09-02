package com.zzw.java1000000.z1167839.stream.writer;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * @author zhengzewang on 2019/5/26.
 */
public class BufferedWriterTest {

    public static void main(String[] args) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        BufferedWriter bufferedWriter = new BufferedWriter(charArrayWriter);
        //
        bufferedWriter.newLine();
        bufferedWriter.write("为实现中华民族伟大复兴的中国梦不懈奋斗");
        System.out.println(charArrayWriter.toString());
        bufferedWriter.flush();
        System.out.println(charArrayWriter.toString());
        bufferedWriter.close();
    }

}
