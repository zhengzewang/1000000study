package com.zzw.java1000000.z1124409.exception.myexception;

public class Square {

    private int length;

    public Square(int length) throws SquareException {
        if (length < 1 || length > Integer.MAX_VALUE ) {
            throw new SquareException("长度不符合规范");
        }
        this.length = length;
    }

    public static void main(String[] args) throws SquareException {
        Square square = new Square(-1);
    }

}
