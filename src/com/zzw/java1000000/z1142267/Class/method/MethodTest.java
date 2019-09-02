package com.zzw.java1000000.z1142267.Class.method;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * @author zhengzewang on 2019/3/12.
 */
public class MethodTest implements MethodTestInterface<String> {

    @MethodAnnotation
    @TypeUseAnnotation
    public MethodRuturn test(String a) {
        System.out.println(a);
        MethodRuturn methodRuturn = new MethodRuturn();
        methodRuturn.setA(a);
        return methodRuturn;
    }


    public void testVarArgs(String... a) {
        //
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class cls = MethodTest.class;
        Method method = cls.getMethod("test", String.class);
        //
        System.out.println(method.getName()); // 名称
        Class clazz = method.getDeclaringClass();
        // 参数
        Parameter[] parameters = method.getParameters(); // parent
        Class<?>[] classes = method.getParameterTypes();
        Type[] types = method.getGenericParameterTypes();
        Annotation[][] annotations = method.getParameterAnnotations();
        AnnotatedType[] annotatedTypes = method.getAnnotatedParameterTypes(); // parent
        int count = method.getParameterCount();
        method.isVarArgs(); // 是否存在可变数量参数
        // 返回值
        Class<?> aClass = method.getReturnType();
        Type type = method.getGenericReturnType();
        method.getAnnotatedReceiverType();
        AnnotatedType annotatedType = method.getAnnotatedReturnType(); // ????
        // 注解
        Annotation[] methodAnnotations = method.getAnnotations(); // parent
        method.getDeclaredAnnotations();
        method.getAnnotation(MethodAnnotation.class);
        method.getDeclaredAnnotation(MethodAnnotation.class); //parent
        method.getAnnotationsByType(MethodAnnotation.class); // parent
        method.getDeclaredAnnotationsByType(MethodAnnotation.class);// parent
        method.isAnnotationPresent(MethodAnnotation.class); // parent
        // exception
        method.getExceptionTypes();
        method.getGenericExceptionTypes();
        method.getAnnotatedExceptionTypes();
        // 类型变量
        TypeVariable<Method>[] variables = method.getTypeParameters(); // 获取类型变量，泛型
        //
        MethodRuturn methodRuturn = (MethodRuturn) method.invoke(cls.newInstance(), "hello world"); // 如果方法没有返回值，则返回null
        AnnotatedType annotatedType1 = method.getAnnotatedReceiverType();
        //
        method.getModifiers(); // 修饰符
        System.out.println(method.toString());
        System.out.println(method.toGenericString()); // 通用类型输出
        System.out.println(method.getDefaultValue()); // 引用数据类型为null，简单数据类型不用说了
        //
        System.out.println(method.isBridge());
        System.out.println(method.isSynthetic()); // 是否由Java编译器
        System.out.println(method.isDefault()); // default method can only be used within an interface
        //
        method.isAccessible();
        method.setAccessible(true);
        //
        method.equals(null);
        System.out.println(method.hashCode());


        // ------------------------

        // 关于isBridge
        method = cls.getMethod("test", Object.class);
        System.out.println(method.isBridge()); // 1.5之前没有泛型，为了兼容。实际上接口中的方法T类型为Object。又因为子类为String，所以不符合继承规则，于是编译器自动生成了一个新方法
        System.out.println(method.isSynthetic());
        //
        cls = MethodAnnotation.class;
        Method[] methods = cls.getMethods();
        System.out.println();
        for (Method me : methods) {
            System.out.println(me.getDefaultValue());
        }
        method = MethodTest.class.getMethod("testVarArgs",String[].class);
        System.out.println(method.isVarArgs());
    }
}
