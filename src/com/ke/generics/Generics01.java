package com.ke.generics;

import java.util.ArrayList;
import java.util.List;

/*
* 泛型模版：实现编写一次，万能匹配，又通过编译器类型检测，保证安全
* */
public class Generics01 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        ArrayList<Float> floatList = new ArrayList<>();

        strList.add("hello");
        String s = strList.get(0);
        System.out.println(s);
        //strList.add(new Integer(132)); //error
        //Integer n = strList.get(0); //error

        //在标准库中ArrayList<T>实现了List<T>接口，可以向上转型为List<T>
        List<Integer> lst = new ArrayList<Integer>();
    }
}
