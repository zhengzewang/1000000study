package com.zzw.java1000000.z1167839.stream.reader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zhengzewang on 2019/5/21.
 */
public class InputStreamReaderTest {

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[]{'a', 'b'});
        InputStreamReader inputStreamReader = new InputStreamReader(byteArrayInputStream);
        //
        System.out.println(inputStreamReader.markSupported());
        //
        System.out.println(inputStreamReader.read());
        char[] chars = new char[1];
        inputStreamReader.read(chars);
        System.out.println(chars[0]);
    }

}
