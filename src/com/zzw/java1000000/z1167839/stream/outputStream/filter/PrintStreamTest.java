package com.zzw.java1000000.z1167839.stream.outputStream.filter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

/**
 * @author zhengzewang on 2019/5/20.
 */
public class PrintStreamTest {

    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // 默认size=32
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        //
        printStream.print("郑泽旺");
        printStream.flush();
        System.out.println(byteArrayOutputStream.toString());
    }

}
