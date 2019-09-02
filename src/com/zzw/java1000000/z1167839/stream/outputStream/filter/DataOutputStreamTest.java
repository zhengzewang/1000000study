package com.zzw.java1000000.z1167839.stream.outputStream.filter;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author zhengzewang on 2019/5/19.
 */
public class DataOutputStreamTest {

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // 默认size=32
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        //
        dataOutputStream.writeChars("郑泽旺");
        dataOutputStream.flush();
        System.out.println(byteArrayOutputStream.toString());
        System.out.println(byteArrayOutputStream.toString("Unicode"));
        //
        byteArrayOutputStream = new ByteArrayOutputStream(); // 默认size=32
        dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF("郑泽旺");
        dataOutputStream.flush();
        System.out.println(byteArrayOutputStream.toString());
        System.out.println(byteArrayOutputStream.toString("Unicode"));
    }

}
