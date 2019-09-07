package com.ke.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
* 获取字段的方法
Field getField(name)：根据字段名获取某个public的field（包括父类）
Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
Field[] getFields()：获取所有public的field（包括父类）
Field[] getDeclaredFields()：获取当前类的所有field（不包括父类）
* */
public class RefFiled
{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class stdClass = Student.class;
        //获取public字段
        System.out.println(stdClass.getField("score"));
        System.out.println(stdClass.getField("name"));
        System.out.println(stdClass.getDeclaredField("grade"));
        /*
        * Filed对象包含：
        * 1. getName()返回字段名字，如"name"
        * 2. getType()返回字段类型，如String.class
        * 3. getModifiers()返回字段修饰符，是一个int，不同字段表示不同含义
        * */
        Field f = String.class.getDeclaredField("value");
        System.out.println(f.getName());
        System.out.println(f.getType());
        int m = f.getModifiers();
        System.out.println(m);
        System.out.println(Modifier.isFinal(m));
        System.out.println(Modifier.isPublic(m));
        System.out.println(Modifier.isPrivate(m));
        System.out.println(Modifier.isPrivate(m));
        System.out.println(Modifier.isStatic(m));

        /*
        * 获取字段的值
        * */

        Person p = new Person("Xiao Ming");
        Class c = p.getClass();
        Field ff = c.getDeclaredField("name");
        //要打印private，需要调用
        //f.setAccessible(true);
        //setAccessible(true)可能会失败。如果JVM运行期存在SecurityManager，
        //那么它会根据规则进行检查，有可能阻止setAccessible(true)
        Object value = ff.get(p);
        System.out.println(value);

        /*
        * 设置字段
        * */
        f.setAccessible(true);
        f.set(p, "Xiao Hong");
        System.out.println(p.getName());

    }
}


