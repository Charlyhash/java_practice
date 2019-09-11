package com.ke.generics.com.ke.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add(null);
        list.add("pear");
        list.add("banana");

        String second = list.get(1);
        System.out.println(second);

        List<Integer> list2 = List.of(1,2,4);
        for (int i = 0; i < list2.size(); i++) {
            int val = list2.get(i);
            System.out.println(val);
        }

        List<String> list3 = List.of("apple", "pear", "banana");
        for (Iterator<String> it = list3.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }

        for (String s:list) {
            System.out.println(s);
        }

        //list 转为array。丢失类型信息，不常用
        Object[] array = list.toArray();
        for (Object s : array) {
            System.out.println(s);
        }

        //给toArray(T())传入一个类型相同的Array, List会自动复制元素到数组
        List<Integer> list4 = List.of(12, 34, 56);
        Integer[] array4 = list4.toArray(new Integer[3]);
        for (Integer n : array4){
            System.out.println(n);
        }

        //Array变List
        Integer[] array5 = {1, 3, 5};
        List<Integer> list5 = Arrays.asList(array5);
        for (Integer n : list5) {
            System.out.println(n);
        }

    }
}
