package com.zzw.java1000000.z1167839.stream.outputStream;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author zhengzewang on 2019/5/9.
 */
public class FileOutputStreamTest {

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\test\\test.txt");
        fileOutputStream.write('a');
        fileOutputStream.flush(); // 啥都不做
        FileDescriptor fileDescriptor = fileOutputStream.getFD(); // 获取文件描述符
        FileChannel fileChannel = fileOutputStream.getChannel(); // 通过文件输出流打开的只能写，不能读
        ByteBuffer buf = ByteBuffer.allocate(32);
        buf.put((byte) 'b');
        buf.flip();
        fileChannel.write(buf);
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileDescriptor); // 不需要boolean参数，因为它与上一个就是一个流
        fileOutputStream2.write('c');
        //
        fileOutputStream.close(); // 关闭后文件描述符和文件通道都会关闭
    }

}
