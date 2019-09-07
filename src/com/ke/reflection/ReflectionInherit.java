package com.ke.reflection;

public class ReflectionInherit {
    public static void main(String[] args) {
        /*
        * 获取父类的class
        * Integer的父类类型是Number，Number的父类是Object，Object的父类是null。
        * 除Object外，其他任何非interface的Class都必定存在一个父类类型。
        * */
        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(n);
        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());

        /*
        * 获取interface
        * 所有interface的Class调用getSuperclass()返回的是其父interface或者null
        * */

        Class[] is = i.getInterfaces();
        for (Class ii : is) {
            System.out.println(ii);
        }

        /*
        * 继承关系
        * */
        //instanceof操作符：判断是否为某个类型
        Object oo = Integer.valueOf(123);
        System.out.println(oo instanceof Double);
        System.out.println(oo instanceof  Integer);
        System.out.println(oo instanceof Number);
        System.out.println(n instanceof  java.io.Serializable);

        //判断一个向上转型是否成立，可以调用isAssignableFrom()
        System.out.println(Integer.class.isAssignableFrom(Integer.class));
        System.out.println(Number.class.isAssignableFrom(Integer.class));
        System.out.println(Object.class.isAssignableFrom(Integer.class));
        System.out.println(Integer.class.isAssignableFrom(Number.class));
    }
}

/*
*
通过Class对象可以获取继承关系：
    Class getSuperclass()：获取父类类型；
    Class[] getInterfaces()：获取当前类实现的所有接口。
通过Class对象的isAssignableFrom()方法可以判断一个向上转型是否可以实现。
* */
