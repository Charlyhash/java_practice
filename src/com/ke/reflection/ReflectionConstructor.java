package com.ke.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionConstructor {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取并调用构造方法
        Constructor cons1 = Integer.class.getConstructor(int.class);
        Integer n1 = (Integer)cons1.newInstance(123);
        System.out.println(n1);

        //获取其他的构造方法
        Constructor cons2 = Integer.class.getConstructor(String.class);
        Integer n2 = (Integer) cons2.newInstance("456");
        System.out.println(n2);


    }
}

/*
* Constructor对象封装了构造方法的所有信息；

通过Class实例的方法可以获取Constructor实例：getConstructor()，
getConstructors()，getDeclaredConstructor()，getDeclaredConstructors()；

通过Constructor实例可以创建一个实例对象：newInstance(Object... parameters)；
 通过设置setAccessible(true)来访问非public构造方法。
* */