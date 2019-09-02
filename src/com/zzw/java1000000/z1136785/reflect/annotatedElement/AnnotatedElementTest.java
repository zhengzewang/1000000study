package com.zzw.java1000000.z1136785.reflect.annotatedElement;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author zhengzewang on 2019/1/1.
 */
@InheritedAnnotation2(value = "child")
public class AnnotatedElementTest extends AnnotatedElementParentTest {

    @AnnotatedAnnotation
    private String field1;
    private String field2;

    @RepeatAnnotation
    @RepeatAnnotation
    private String field3;

    @Override
    public void doit() {
        System.out.println("parent");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class cls = AnnotatedElementTest.class;
        Method method = cls.getDeclaredMethod("doit");
        System.out.println(method.isAnnotationPresent(InheritedAnnotation.class));
        //
        System.out.println(cls.isAnnotationPresent(InheritedAnnotation.class));
        System.out.println("InheritedAnnotation↓");
        Annotation[] clsAnnotations = cls.getAnnotationsByType(InheritedAnnotation.class);
        for (Annotation annotation : clsAnnotations) {
            System.out.println(annotation);
        }
        System.out.println("DeclaredInheritedAnnotation↓");
        Annotation[] dClsAnnotations = cls.getDeclaredAnnotationsByType(InheritedAnnotation.class);
        for (Annotation annotation : dClsAnnotations) {
            System.out.println(annotation);
        }
        System.out.println("InheritedAnnotation2↓");
        clsAnnotations = cls.getAnnotationsByType(InheritedAnnotation2.class);
        for (Annotation annotation : clsAnnotations) {
            System.out.println(((InheritedAnnotation2) annotation).value());
        }
        System.out.println("DeclaredInheritedAnnotation2↓");
        dClsAnnotations = cls.getDeclaredAnnotationsByType(InheritedAnnotation2.class);
        for (Annotation annotation : dClsAnnotations) {
            System.out.println(((InheritedAnnotation2) annotation).value());
        }
        Field[] fields = cls.getDeclaredFields();
        System.out.println("fields↓");
        for (Field field : fields) {
            System.out.println(field.getName() + "：" + field.isAnnotationPresent(AnnotatedAnnotation.class));
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }
            System.out.println("repeat↓");
            RepeatAnnotation repeatAnnotation = field.getAnnotation(RepeatAnnotation.class);
            System.out.println(repeatAnnotation);
            System.out.println("repeats↓");
            RepeatAnnotations repeatAnnotations2 = field.getAnnotation(RepeatAnnotations.class);
            System.out.println(repeatAnnotations2);
            System.out.println("repeatByType↓");
            RepeatAnnotation[] repeatAnnotations = field.getDeclaredAnnotationsByType(RepeatAnnotation.class);
            for (RepeatAnnotation annotation : repeatAnnotations) {
                System.out.println(annotation);
            }
            System.out.println("repeatsByType↓");
            RepeatAnnotations[] repeatAnnotations1 = field.getDeclaredAnnotationsByType(RepeatAnnotations.class);
            for (RepeatAnnotations annotation : repeatAnnotations1) {
                System.out.println(annotation);
            }
            System.out.println();
        }
    }

}
