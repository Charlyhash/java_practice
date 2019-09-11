package com.ke.generics;

import com.ke.oop.a07static.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 使用泛型
* */
public class Generics02 {
    public static void main(String[] args) {
        //如果没有定义泛型类型，那么实际就是Object:
        List list = new ArrayList();
        list.add("Hello");
        list.add("world");
        String first = (String)list.get(0);
        String second = (String)list.get(1);
        System.out.println(first + " " + second);

        //使用泛型类型<String>后，泛型接口变成强类型
        List<String> strList = new ArrayList<>();
        strList.add("first");
        strList.add("second");
        //不需要强制转型
        String f = strList.get(0);
        String s = strList.get(1);
        System.out.println(f + " " + s);

        //使用Number类型后，接口变为强类型List<Number>
        List<Number> numList = new ArrayList<>();
        numList.add(123);
        numList.add(12.34);
        Number num1 = numList.get(0);
        Number num2 = numList.get(1);
        System.out.println(num1 + " " + num2);

        //泛型接口：在接口中使用泛型T
        //比如Arrays.sort(Object[])可以对任意的数组排序，但是必须实现Comparable<T>
        String[] ss = new String[] {"Orange", "Apple", "Pear"};
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));

        Cat[] cs = new Cat[] {
                 new Cat("Bob", 61),
                 new Cat("Alice", 88),
                 new Cat("Lily", 75),
        };

        Arrays.sort(cs);
        System.out.println(Arrays.toString(cs));
    }

    private static class Cat implements Comparable<Cat>{
        String name;
        int weight;

        public Cat(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return this.name + "," + this.weight;
        }

        @Override
        public int compareTo(Cat other) {
            return this.name.compareTo(other.name);
        }
    }
}
