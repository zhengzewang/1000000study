package com.zzw.java1000000.z1167839.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zhengzewang on 2019/4/6.
 */
public class SimpleTest {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char c;
        do {
            c = (char) reader.read();
            System.out.println(c);
        }while (c != 'q');
    }

}
