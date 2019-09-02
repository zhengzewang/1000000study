package com.zzw.java1000000.z1167839.stream.reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author zhengzewang on 2019/5/21.
 */
public class FileReaderTest {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\test\\test.txt");
        System.out.println(fileReader.markSupported());
        System.out.println(fileReader.read());
        char[] chars = new char[1];
        fileReader.read(chars);
        System.out.println(chars[0]);
    }

}
