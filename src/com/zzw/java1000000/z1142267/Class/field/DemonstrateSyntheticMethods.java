package com.zzw.java1000000.z1142267.Class.field;

import static java.lang.System.out;
import java.util.Calendar;

/**
 * @author zhengzewang on 2019/3/27.
 */
public final class DemonstrateSyntheticMethods
{
    public static void main(final String[] arguments)
    {
        DemonstrateSyntheticMethods.NestedClass nested =
                new DemonstrateSyntheticMethods.NestedClass();
        out.println("String: " + nested.highlyConfidential);
    }

    private static final class NestedClass
    {
        private String highlyConfidential = "Don't tell anyone about me";
        private int highlyConfidentialInt = 42;
        private Calendar highlyConfidentialCalendar = Calendar.getInstance();
        private boolean highlyConfidentialBoolean = true;
    }
}