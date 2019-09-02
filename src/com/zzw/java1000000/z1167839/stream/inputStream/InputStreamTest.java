package com.zzw.java1000000.z1167839.stream.inputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * @author zhengzewang on 2019/4/7.
 */
public class InputStreamTest {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
        //
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[]{-128,-1,0,127});
        System.out.println(byteArrayInputStream.read());
        System.out.println(byteArrayInputStream.read());
        System.out.println(byteArrayInputStream.read());
        System.out.println(byteArrayInputStream.read());
        read(byteArrayInputStream);
        //
        byteArrayInputStream = new ByteArrayInputStream(new byte[3],1,4);
        read(byteArrayInputStream);
        //
        byteArrayInputStream = new ByteArrayInputStream(new byte[]{-128,-1,0,127});
        System.out.println(byteArrayInputStream.markSupported());
        byteArrayInputStream.mark(2); // readAheadLimit参数不会生效
        read(byteArrayInputStream);
        read(byteArrayInputStream);
        byteArrayInputStream.reset();
        read(byteArrayInputStream);
        //
        byteArrayInputStream = new ByteArrayInputStream(new byte[]{-128,-1,0,127});
        byteArrayInputStream.skip(1);
        read(byteArrayInputStream);
        byteArrayInputStream.close();
        byteArrayInputStream.reset();
        read(byteArrayInputStream);
    }

    private static void read(ByteArrayInputStream byteArrayInputStream) throws IOException {
        byte[] bytes = new byte[byteArrayInputStream.available()];
        System.out.println(byteArrayInputStream.read(bytes));
        System.out.println(Arrays.toString(bytes));
        System.out.println();
    }

}
