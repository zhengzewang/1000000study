package com.zzw.java1000000.z1136785.reflect.type;

import java.io.Serializable;
import java.lang.reflect.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhengzewang on 2018/12/28.
 */
public class TypeTest<T extends InterImpl & Serializable,
        V extends Map<String, String> & Inter1<? extends List> & Inter2<? super ArrayList>,
        N extends Map<? extends Number[], List<String>[][]>> extends ArrayList<String[]> {

    // ParameterizedType
    private List<String> type1_1;
    private List<List<String>> type1_2;

    // GenericArrayType
    private T[] ts;
    private T[][][] tsss;
    private List<? extends String>[] lists;

    private String[][] strings;

    // TypeVariable<D extends GenericDeclaration>
    public <K extends Number> void testk() {
        //
    }

    // WildcardType
    private Map<? extends String, ? extends String> map;

    public static void main(String[] args) throws NoSuchFieldException {
        Class cls = TypeTest.class;
        // 获取类定义的泛型
        TypeVariable[] typeVariables = cls.getTypeParameters();
        for (TypeVariable variable : typeVariables) {
            System.out.println(getTypeOfType("", variable));
        }
        //
        Field field = cls.getDeclaredField("strings");
        Type type = field.getGenericType();
        System.out.println(getTypeOfType("", type));
    }

    public static String getTypeOfType(String blank, Type type) {
        String typeType = "type";
        String blankTemp = blank;
        String inTypeStr = "";
        if (type instanceof ParameterizedType) {
            typeType = "ParameterizedType";
            ParameterizedType parameterizedType = (ParameterizedType) type;
            for (Type inType : parameterizedType.getActualTypeArguments()) {
                blank = blankTemp + " ";
                inTypeStr += getTypeOfType(blank, inType);
            }
        }
        if (type instanceof GenericArrayType) {
            typeType = "GenericArrayType";
            GenericArrayType genericArrayType = (GenericArrayType) type;
            blank = blankTemp + " ";
            inTypeStr = getTypeOfType(blank, genericArrayType.getGenericComponentType());
        }
        if (type instanceof TypeVariable) {
            typeType = "TypeVariable";
            TypeVariable variable = (TypeVariable) type;
            Type[] types = variable.getBounds();
            for (Type inType : types) {
                blank = blankTemp + " ";
                inTypeStr += getTypeOfType(blank, inType);
            }
        }
        if (type instanceof WildcardType) {
            typeType = "WildcardType";
            WildcardType wildcardType = (WildcardType) type;
            Type[] types1 = wildcardType.getUpperBounds();
            inTypeStr += blankTemp + "upperBounds:\n";
            for (Type inType : types1) {
                blank = blankTemp + " ";
                inTypeStr += getTypeOfType(blank, inType);
            }
            Type[] types2 = wildcardType.getLowerBounds();
            inTypeStr += blankTemp + "lowerBounds:\n";
            for (Type inType : types2) {
                blank = blankTemp + " ";
                inTypeStr += getTypeOfType(blank, inType);
            }
        }
        if (type instanceof Class) {
            typeType = "Class";
            if (((Class) type).isArray()) {
                blank = blankTemp + " ";
                inTypeStr += getTypeOfType(blank,((Class) type).getComponentType());
            }
        }
        return blankTemp + typeType + "：" + type.getTypeName() + "\n" + inTypeStr;
    }


}
