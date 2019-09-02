package com.zzw.java1000000.z1167839.stream.file;


import java.io.*;

/**
 * @author zhengzewang on 2019/5/26.
 */
public class WRFileTest {

    public static void main(String[] args) throws IOException {
//        method1ForRead();
//        method2ForRead();
//        method3ForRead();
//        method4ForRead();
//        method1ForWrite();
//        method2ForWrite();
//        method3ForWrite();
//        method4ForWrite();
        String str = "为实现中华民族伟大复兴的中国梦不懈奋斗";
        FileWriter writer = new FileWriter("D:\\test\\test.txt");
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.format("%s",str);
        printWriter.close();
    }

    private static void method4ForWrite() throws IOException {
        String str = "为实现中华民族伟大复兴的中国梦不懈奋斗";
        FileWriter writer = new FileWriter("D:\\test\\test.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(str);
        bufferedWriter.close();
    }

    private static void method3ForWrite() throws IOException {
        String str = "为实现中华民族伟大复兴的中国梦不懈奋斗";
        FileWriter writer = new FileWriter("D:\\test\\test.txt");
        writer.write(str);
        writer.close();
    }

    private static void method2ForWrite() throws FileNotFoundException {
        String str = "为实现中华民族伟大复兴的中国梦不懈奋斗";
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\test\\test.txt");
        PrintStream printStream = new PrintStream(fileOutputStream); // 其他FilterOutputStream类似
        printStream.print(str);
        printStream.close();
    }

    private static void method1ForWrite() throws IOException {
        String str = "为实现中华民族伟大复兴的中国梦不懈奋斗";
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\test\\test.txt");
        byte[] bytes = str.getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    private static void method4ForRead() throws IOException {
        FileReader fileReader = new FileReader("D:\\test\\test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s = bufferedReader.readLine();
        while (s != null) {
            System.out.println(s);
            s = bufferedReader.readLine();
        }
    }

    private static void method3ForRead() throws IOException {
        FileReader fileReader = new FileReader("D:\\test\\test.txt");
        int read = fileReader.read();
        while (read != -1) {
            System.out.print((char) read);
            read = fileReader.read();
        }
        System.out.println();
    }

    private static void method2ForRead() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\test\\test.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] bytes = new byte[bufferedInputStream.available()];
        bufferedInputStream.read(bytes);
        System.out.println(new String(bytes));
    }

    private static void method1ForRead() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\test\\test.txt");
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        System.out.println(new String(bytes));
    }

}
