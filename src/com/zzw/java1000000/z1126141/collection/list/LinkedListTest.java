package com.zzw.java1000000.z1126141.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> linkedList1 = new LinkedList<>();
        LinkedList linkedList2 = new LinkedList(new ArrayList());
        //
        linkedList1.add("test1");
        linkedList1.add("test2");
        linkedList1.add("test3");
        linkedList1.add("test4");
        String test = linkedList1.removeLast();
        while (test != null) {
            System.out.println(test);
            test = linkedList1.removeLast();
        }
    }

}
