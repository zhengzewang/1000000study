package com.zzw.java1000000.z1167839.stream.writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zhengzewang on 2019/5/26.
 */
public class FileWriterTest {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\test\\test.txt");
        fileWriter.write("为实现中华民族伟大复兴的中国梦不懈奋斗");
        fileWriter.flush(); // flush或close后，字符串才会被写入文本中
        fileWriter.close();
    }

}
