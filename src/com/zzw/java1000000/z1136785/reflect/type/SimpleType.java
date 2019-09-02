package com.zzw.java1000000.z1136785.reflect.type;

import java.io.Serializable;
import java.lang.reflect.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author zhengzewang on 2018/12/29.
 */
public class SimpleType<K extends Map.Entry<? extends String[][],
        List<? extends String>[]> & Iterator<? super V[]>, V> {

    public <T extends Number> List<T> testTypeVariable() {
        return null;
    }

    public <T extends Number & Serializable> void testBounds() {
        //
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class cls = SimpleType.class;
        TypeVariable[] variables = cls.getTypeParameters();
        for (TypeVariable variable : variables) {
            System.out.println(getTypeInfo("", variable));
        }
        //
//        Method method = cls.getDeclaredMethod("testTypeVariable");
//        TypeVariable[] variables2 = method.getTypeParameters();
//        for (TypeVariable variable : variables2) {
//            System.out.println(getTypeInfo("", variable));
//        }
//        Type type = method.getGenericReturnType();
//        System.out.println(getTypeInfo("", type));
    }


    public static String getTypeInfo(String blank, Type type) {
//        String bt = blank;
        String result = "";
        if (type instanceof ParameterizedType) {
            // eg Map.Entry<String,String>
            result += print(blank, "ParameterizedType：" + type.getTypeName());
            ParameterizedType parameterizedType = (ParameterizedType) type;
            result += print(blank + " ", ">rowType：");
            Type rawType = parameterizedType.getRawType();
            result += getTypeInfo(blank + "  ", rawType);
            result += print(blank + " ", ">ownerType：");
            Type ownerType = parameterizedType.getOwnerType();
            result += getTypeInfo(blank + "  ", ownerType);
            //
            result += print(blank + " ", ">actualTypeArguments：");
            Type[] types = parameterizedType.getActualTypeArguments();
            for (Type inType : types) {
                result += getTypeInfo(blank + "  ", inType);
            }
        } else if (type instanceof TypeVariable) {
            // eg <T>
            result += print(blank, "TypeVariable：" + type.getTypeName());
            TypeVariable variable = (TypeVariable) type;
            GenericDeclaration declaration = variable.getGenericDeclaration();
            result += print(blank + " ", ">genericDeclaration：");
            result += print(blank + "  ", declaration.toString());
            result += print(blank + " ", ">bounds：");
            Type[] types = variable.getBounds();
            for (Type inType : types) {
                result += getTypeInfo(blank + "  ", inType);
            }
        } else if (type instanceof GenericArrayType) {
            // eg List<String>[]
            result += print(blank, "GenericArrayType：" + type.getTypeName());
            GenericArrayType genericArrayType = (GenericArrayType) type;
            result += print(blank + " ", ">genericComponentType：");
            result += getTypeInfo(blank + "  ", genericArrayType.getGenericComponentType());
        } else if (type instanceof WildcardType) {
            // eg <? extends String>
            result += print(blank, "WildcardType：" + type.getTypeName());
            WildcardType wildcardType = (WildcardType) type;
            result += print(blank + " ", ">upperBounds：");
            Type[] upperBounds = wildcardType.getUpperBounds();
            for (Type inType : upperBounds) {
                result += getTypeInfo(blank + "  ", inType);
            }
            result += print(blank + " ", ">lowerBounds：");
            Type[] lowerBounds = wildcardType.getLowerBounds();
            for (Type inType : lowerBounds) {
                result += getTypeInfo(blank + "  ", inType);
            }
        } else if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                // eg String[]
                result += print(blank, "Array：" + type.getTypeName());
                result += print(blank + " ", ">componentType：");
                result += getTypeInfo(blank + "  ", cls.getComponentType());
            } else {
                result += print(blank, "Class：" + type.getTypeName());
            }
        }
        return result;
    }

    public static String print(String blank, String info) {
        return blank + info + "\n";
    }


}
