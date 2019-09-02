package com.zzw.java1000000.z1167839.stream.inputStream.object;

import java.io.*;

/**
 * @author zhengzewang on 2019/4/23.
 */
public class ObjectInputStreamTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        readObject();
        readBoolean();
        readInt();
        readUTF();
    }

    private static void readUTF() throws IOException, ClassNotFoundException {
        File file = new File("D:\\test\\test.txt");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        User user = new User();
        user.setId("test");
        user.setName("测试");
        objectOutputStream.writeObject(user);
        objectOutputStream.close(); // 一定要关流
        //
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        //
        System.out.println(objectInputStream.readObject());
    }

    private static void readInt() throws IOException, ClassNotFoundException {
        File file = new File("D:\\test\\test.txt");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeInt(new Integer(100));
        objectOutputStream.close(); // 一定要关流
        //
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readInt());
    }

    private static void readBoolean() throws IOException, ClassNotFoundException {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
        //  `
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(pipedOutputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(pipedInputStream);
        //
        objectOutputStream.writeObject(true);
        //
        System.out.println(objectInputStream.readObject());
    }

    private static void readObject() throws IOException, ClassNotFoundException {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
        //  `
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(pipedOutputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(pipedInputStream);
        //
        User user = new User();
        user.setId("test");
        user.setName("测试");
        objectOutputStream.writeObject(user);
        //
        user = (User) objectInputStream.readObject();
        System.out.println(user);
    }

    public static String intToBinary(int i) {
        return intToBinary(i, 32);
    }

    public static String shortToBinary(short s) {
        int i = s & 0xffff;
        return intToBinary(i, 16);
    }

    public static String byteToBinary(byte b) {
        int i = b & 0xff;
        return intToBinary(i, 8);
    }

    private static String intToBinary(int i, int length) {
        String s = getIntString(i);
        if (s.length() > length) {
            s = s.substring(s.length() - length);
        } else {
            while (s.length() < length) {
                s = "0" + s;
            }
        }
        return s;
    }

    private static String getIntString(int i) {
        if (i == 0) {
            return "0";
        }
        int t = i >>> 1 << 1;
        if (t == i) {
            return getIntString(i >>> 1) + "0";
        } else {
            return getIntString(t >>> 1) + "1";
        }
    }

}
