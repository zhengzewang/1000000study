package com.zzw.java1000000.z1123834.innerclass.member.pack1;

import com.zzw.java1000000.z1123834.innerclass.member.Polygon;

public class GetPolygon {

    private static class Triangle implements Polygon {

        @Override
        public void print() {
            System.out.println("三角形");
        }
    }

    private static class Square implements Polygon {

        @Override
        public void print() {
            System.out.println("正方形");
        }
    }

    public static Polygon getTriangle() {
        return new Triangle();
    }

    public static Polygon getSquare() {
        return new Square();
    }

}
