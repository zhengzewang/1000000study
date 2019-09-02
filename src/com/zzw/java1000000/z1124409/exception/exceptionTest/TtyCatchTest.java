package com.zzw.java1000000.z1124409.exception.exceptionTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TtyCatchTest {

    public static void main(String[] args) {
        File file = new File("D:\\test");
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
