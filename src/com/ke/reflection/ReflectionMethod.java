package com.ke.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* 获取method的方法：
Method getMethod(name, Class...)：获取某个public的Method（包括父类）
Method getDeclaredMethod(name, Class...)：获取当前类的某个Method（不包括父类）
Method[] getMethods()：获取所有public的Method（包括父类）
Method[] getDeclaredMethods()：获取当前类的所有Method（不包括父类）
* */
public class ReflectionMethod {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class stdClass = Student.class;
        //参数为String
        System.out.println(stdClass.getMethod("getScore", String.class));
        System.out.println(stdClass.getMethod("getName"));
        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));

        /*
        * getName()：返回方法名称，例如："getScore"；
        getReturnType()：返回方法返回值类型，也是一个Class实例，例如：String.class；
        getParameterTypes()：返回方法的参数类型，是一个Class数组，例如：{String.class, int.class}；
        getModifiers()：返回方法的修饰符，它是一个int，不同的bit表示不同的含义
        * */

        /*
        * 调用方法
        * */

        String s = "Hello world";
        Method m = String.class.getMethod("substring", int.class);
        //invoke的第一个参数是对象实例，即在哪个实例上调用该方法，后面的可变参数要与方法参数一致，否则将报错
        String r = (String)m.invoke(s, 6);//substring(6);
        System.out.println(r);

        //调用静态方法, 传入null
        m = Integer.class.getMethod("parseInt", String.class);
        Integer n = (Integer) m.invoke(null, "12345");
        System.out.println(n);

        //调用非public方法
        Person p = new Person();
        m = p.getClass().getDeclaredMethod("setName", String.class);
        m.setAccessible(true);
        m.invoke(p, "Bob");
        System.out.println(p.getName());

        //多态
        Method h = Person.class.getMethod("hello");
        h.invoke(new Student("abc"));
    }
}

/**
 *
 * 总结
 * Java的反射API提供的Method对象封装了方法的所有信息：
 *
 * 通过Class实例的方法可以获取Method实例：getMethod()，getMethods()，getDeclaredMethod()，getDeclaredMethods()；
 *
 * 通过Method实例可以获取方法信息：getName()，getReturnType()，getParameterTypes()，getModifiers()；
 *
 * 通过Method实例可以调用某个对象的方法：Object invoke(Object instance, Object... parameters)；
 *
 * 通过设置setAccessible(true)来访问非public方法；
 *
 * 通过反射调用方法时，仍然遵循多态原则。
 *
 */