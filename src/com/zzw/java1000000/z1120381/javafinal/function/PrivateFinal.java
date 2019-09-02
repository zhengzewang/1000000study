package com.zzw.java1000000.z1120381.javafinal.function;

public class PrivateFinal {

    private void test1(){

    }


    private final void test2(){

    }


    class PrivateFinalChild extends PrivateFinal{
//        @Override
        private void test1(){

        }
    }

}
