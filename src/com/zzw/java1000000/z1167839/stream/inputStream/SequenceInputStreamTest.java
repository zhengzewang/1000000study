package com.zzw.java1000000.z1167839.stream.inputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;

/**
 * @author zhengzewang on 2019/4/7.
 * <p>
 * 合并输入流
 */
public class SequenceInputStreamTest {

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(new byte[]{5, 6, 7});
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(new byte[]{9, 10, 11});
        SequenceInputStream sequenceInputStream = new SequenceInputStream(byteArrayInputStream1, byteArrayInputStream2);
        read2(sequenceInputStream);
        byteArrayInputStream1.reset();
        byteArrayInputStream2.reset();
        sequenceInputStream = new SequenceInputStream(byteArrayInputStream1, byteArrayInputStream2);
        System.out.println(sequenceInputStream.markSupported());
        read(sequenceInputStream);
        read(sequenceInputStream);
        byteArrayInputStream1.reset();
        byteArrayInputStream2.reset();
        sequenceInputStream = new SequenceInputStream(byteArrayInputStream1, byteArrayInputStream2);
        sequenceInputStream.close();
        read2(sequenceInputStream); // 关闭后读取不到任何数据
    }

    private static void read(SequenceInputStream sequenceInputStream) throws IOException {
        byte[] bytes = new byte[sequenceInputStream.available()]; // 第二次读取时available返回0
        System.out.println(sequenceInputStream.read(bytes));
        System.out.println(Arrays.toString(bytes));
        System.out.println();
    }

    private static void read2(SequenceInputStream sequenceInputStream) throws IOException {
        int t = sequenceInputStream.read();
        while (t != -1) {
            System.out.println((byte) t);
            t = sequenceInputStream.read();
        }
        System.out.println();
    }

}
