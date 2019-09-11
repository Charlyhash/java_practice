package com.ke.generics;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getSecond() {
        return second;
    }

    //静态方法
    public static<K> Pair<K> create(K first, K last) {
        return new Pair<>(first, last);
    }

    //多个类型的泛型

/*
 擦拭法决定了泛型<T>：

不能是基本类型，例如：int；
不能获取带泛型类型的Class，例如：Pair<String>.class；
不能判断带泛型类型的类型，例如：x instanceof Pair<String>；
不能实例化T类型，例如：new T()。
*/

}
