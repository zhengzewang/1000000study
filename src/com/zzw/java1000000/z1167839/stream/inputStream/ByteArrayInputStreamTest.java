package com.zzw.java1000000.z1167839.stream.inputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author zhengzewang on 2019/4/7.
 * <p>
 * 字节数组输入流
 */
public class ByteArrayInputStreamTest {

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream byteArrayInputStream = null;
        byteArrayInputStream = new ByteArrayInputStream(new byte[]{-128, -1, 0, 127});
        // read方法
        System.out.println(byteArrayInputStream.read()); // 可以使用强制类型转换为byte
        System.out.println(byteArrayInputStream.read());
        System.out.println(byteArrayInputStream.read());
        System.out.println(byteArrayInputStream.read());
        System.out.println();
        //
        read(byteArrayInputStream);
        //
        byteArrayInputStream = new ByteArrayInputStream(new byte[]{-128, -1, 0, 127});
        byte[] bytes = new byte[byteArrayInputStream.available()];
        System.out.println(byteArrayInputStream.read(bytes, 1, 2));
        System.out.println(Arrays.toString(bytes));
        System.out.println();
        // skip
        byteArrayInputStream = new ByteArrayInputStream(new byte[]{-128, -1, 0, 127});
        byteArrayInputStream.skip(1);
        read(byteArrayInputStream);
        // mark reset
        byteArrayInputStream = new ByteArrayInputStream(new byte[]{-128, -1, 0, 127});
        System.out.println(byteArrayInputStream.markSupported());
        byteArrayInputStream.mark(0); // 参数不会生效，随便填
        byteArrayInputStream.skip(1);
        byteArrayInputStream.reset();
        read(byteArrayInputStream);
        //
        byteArrayInputStream = new ByteArrayInputStream(new byte[]{-128, -1, 0, 127});
        byteArrayInputStream.close();
        read(byteArrayInputStream);
    }

    private static void read(ByteArrayInputStream byteArrayInputStream) throws IOException {
        byte[] bytes = new byte[byteArrayInputStream.available()];
        System.out.println(byteArrayInputStream.read(bytes));
        System.out.println(Arrays.toString(bytes));
        System.out.println();
    }

}
