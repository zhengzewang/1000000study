package com.zzw.java1000000.z1167839.stream.writer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author zhengzewang on 2019/5/26.
 */
public class OutputStreamWriterTest {

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream);
        outputStreamWriter.write("为实现中华民族伟大复兴的中国梦不懈奋斗");
        System.out.println(outputStreamWriter.getEncoding());
        System.out.println(byteArrayOutputStream.toString());
        outputStreamWriter.flush();
        System.out.println(byteArrayOutputStream.toString());
        outputStreamWriter.close();
    }

}
