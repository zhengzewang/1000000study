package com.zzw.java1000000.z1167839.stream.inputStream;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengzewang on 2019/4/7.
 */
public class FileInputStreamTest {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\test\\testinput.txt");
        System.out.println(fileInputStream.markSupported());
        System.out.println(fileInputStream.available());
        fileInputStream.getFD();
        fileInputStream.getChannel();
        //
        int b = fileInputStream.read();
        List<Byte> byteList = new ArrayList<>();
        while (b != -1) {
            byteList.add((byte) b);
            b = fileInputStream.read();
        }
        byte[] bytes = new byte[byteList.size()];
        for (int i = 0; i < byteList.size(); i++) {
            bytes[i] = byteList.get(i);
        }
        String s = new String(bytes, "GB2312");
        System.out.println(s);
        System.out.println(bytes.length);
        System.out.println(fileInputStream.available());
    }

}
