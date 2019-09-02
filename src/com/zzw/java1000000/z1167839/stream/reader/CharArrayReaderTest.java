package com.zzw.java1000000.z1167839.stream.reader;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @author zhengzewang on 2019/5/25.
 */
public class CharArrayReaderTest {

    public static void main(String[] args) throws IOException {
        char[] chars = new char[]{'郑', '泽', '旺'};
        CharArrayReader charArrayReader = new CharArrayReader(chars);
        //
        System.out.println(charArrayReader.markSupported());
        System.out.println(charArrayReader.read());
        charArrayReader.close();
        //
    }

}
