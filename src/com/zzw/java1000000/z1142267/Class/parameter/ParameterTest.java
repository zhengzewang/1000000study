package com.zzw.java1000000.z1142267.Class.parameter;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengzewang on 2019/3/25.
 */
public class ParameterTest {

    private String b;

    public void test(String b) {
        this.b = b;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        ParameterTest test = new ParameterTest();
        Class cls = test.getClass();
        //
        Method method = cls.getMethod("test", String.class);
        Parameter[] parameters = method.getParameters();
        if (parameters.length == 0) {
            return;
        }
        Parameter parameter = parameters[0];
        //
        System.out.println(parameter.getName());
        System.out.println(parameter.isNamePresent()); // 是否保留了原参数名
        parameter.getDeclaringExecutable();
        //
        parameter.getType();
        parameter.getParameterizedType();
        //
        parameter.getAnnotations();
        parameter.getDeclaredAnnotations();
        parameter.getAnnotation(ParameterAnnotation.class);
        parameter.getDeclaredAnnotation(ParameterAnnotation.class);
        parameter.getAnnotationsByType(ParameterAnnotation.class);
        parameter.getDeclaredAnnotationsByType(ParameterAnnotation.class);
        parameter.isAnnotationPresent(ParameterAnnotation.class);
        parameter.getAnnotatedType();
        //
        parameter.getModifiers();
        //
        parameter.isVarArgs();
        //
        parameter.isSynthetic();
        //
        System.out.println(parameter.isImplicit()); // ???
        //
        System.out.println(parameter.toString());
    }

}
