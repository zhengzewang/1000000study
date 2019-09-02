package com.zzw.java1000000.z1123834.innerclass.member;

import com.zzw.java1000000.z1123834.innerclass.member.pack1.GetPolygon;

public class PolygonTest {
    public static void main(String[] args) {
        // 三角形
        Polygon triangle = GetPolygon.getTriangle();
        triangle.print();
        Polygon square = GetPolygon.getSquare();
        square.print();
    }
}
