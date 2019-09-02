package com.zzw.java1000000.z1167839.stream.inputStream;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.Arrays;

/**
 * @author zhengzewang on 2019/4/22.
 */
public class DataInputStreamTest {

    public static void main(String[] args) throws IOException {
//        test1();
//        test2();
//        test3();
        test4();
    }

    private static void test4() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream("郑泽旺".getBytes()));
        //
        PushbackInputStream pushbackInputStream = new PushbackInputStream(dataInputStream,2);
        pushbackInputStream.unread(dataInputStream.available());
        pushbackInputStream.unread(0);
        //
        DataInputStream dataInputStream_utf = new DataInputStream(pushbackInputStream);
        System.out.println(dataInputStream_utf.readUTF());
    }


    private static void test3() throws IOException {
        byte[] bytes = new byte[]{0, 3, 'a', 'b', 'c'}; // 前两位标识待读取的长度 UnsignedShort
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bytes));
        System.out.println(dataInputStream.available());
        System.out.println(dataInputStream.readUTF());
        //
        bytes = new byte[]{0, (byte) "郑泽旺".getBytes().length};
        byte[] bytes_utf = "郑泽旺".getBytes();
        int length1 = bytes.length;
        int length2 = bytes_utf.length;
        bytes = Arrays.copyOf(bytes, length1 + length2);
        System.arraycopy(bytes_utf, 0, bytes, length1, length2);
        dataInputStream = new DataInputStream(new ByteArrayInputStream(bytes));
        System.out.println(dataInputStream.available());
        System.out.println(dataInputStream.readUTF());
    }

    /**
     * 证明java内存用的是UTF-16编码
     */
    private static void test2() throws IOException {
        int i = '郑'; // 不要使用0~255之间的字符测试
        String a = "郑";
        byte[] bytes = a.getBytes("UTF-16");
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bytes));
        dataInputStream.readChar(); // 去掉前面的标识位
        System.out.println(dataInputStream.readUnsignedShort() == i);
    }

    private static void test1() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(new byte[]{'a', 'b', 'c', 'h', 'e', 'l', 'l', 'o', '\n', 'a'}));
        System.out.println(dataInputStream.markSupported()); // 由被包装流决定
        dataInputStream.mark(1); // 由被包装流决定
        dataInputStream.reset();// 由被包装流决定
        dataInputStream.close();// 由被包装流决定
        dataInputStream.skip(1); // 由被包装流决定
        System.out.println(dataInputStream.readLine());
        dataInputStream.readChar();
    }

}
