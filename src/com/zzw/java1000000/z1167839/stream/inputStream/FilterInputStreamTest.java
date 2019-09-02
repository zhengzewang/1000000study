package com.zzw.java1000000.z1167839.stream.inputStream;

import java.io.*;

/**
 * @author zhengzewang on 2019/4/9.
 */
public class FilterInputStreamTest {

    public static void main(String[] args) throws IOException {
        BufferedInputStreamTest();
    }


    private static void BufferedInputStreamTest1() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new ByteArrayInputStream(new byte[]{'a', 'b', 'c', 'd', 'e', 'f'}));
        System.out.println((char) bufferedInputStream.read());
        bufferedInputStream.mark(3);
        int i = 0;
        while (i++ < 4) { // 读取已超过readlimit
            System.out.println(bufferedInputStream.read());
        }
        bufferedInputStream.reset();
    }

    private static void BufferedInputStreamTest() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new ByteArrayInputStream(new byte[]{'a', 'b', 'c', 'd'}),2);
        System.out.println(bufferedInputStream.markSupported());
        System.out.println(bufferedInputStream.available());
        System.out.println(bufferedInputStream.markSupported());
        System.out.println((char) bufferedInputStream.read());
        bufferedInputStream.mark(4); //  超过这个限制可能会导致reset失败
        read(bufferedInputStream);
        bufferedInputStream.reset();
        read(bufferedInputStream);
    }

    private static void dataInputStreamTest() throws IOException {
        FilterInputStream filterInputStream = new DataInputStream(new ByteArrayInputStream("郑泽旺".getBytes("UTF-16")));
        filterInputStream.skip(2); // 为什么跳过2可以看到我的文章 Unicode
        System.out.println(((DataInputStream) filterInputStream).readChar());
        System.out.println(((DataInputStream) filterInputStream).readChar());
        System.out.println(((DataInputStream) filterInputStream).readChar());
    }

    public static void read(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        while (i != -1) {
            System.out.println((char) i);
            i = inputStream.read();
        }
    }

}

class FilterInputStreamChild extends FilterInputStream {

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected FilterInputStreamChild(InputStream in) {
        super(in);
    }
}
