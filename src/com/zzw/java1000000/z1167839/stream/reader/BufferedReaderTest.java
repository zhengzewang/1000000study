package com.zzw.java1000000.z1167839.stream.reader;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zhengzewang on 2019/5/21.
 */
public class BufferedReaderTest {

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[]{'a', 'b','c', 'd', 'e'});
        InputStreamReader inputStreamReader = new InputStreamReader(byteArrayInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader,3);
        //
        System.out.println(bufferedReader.markSupported());
        bufferedReader.mark(2);
        System.out.println(bufferedReader.read());
        System.out.println(bufferedReader.read());
        System.out.println(bufferedReader.read());
        bufferedReader.reset(); // 不报错
        bufferedReader.mark(3);
        System.out.println(bufferedReader.read());
        System.out.println(bufferedReader.read());
        System.out.println(bufferedReader.read());
        System.out.println(bufferedReader.read());
        bufferedReader.reset(); // 报错
        //
    }

}
