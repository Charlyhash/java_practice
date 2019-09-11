package com.ke.generics;

public class Generics03 {
    public static void main(String[] args) {
        Pair<Integer> p = new Pair<>(123, 456);
        get(p);
        Pair<Number> p1 = new Pair<>(12.3,4.56);
        Pair<Integer> p2 = new Pair<>(123, 456);
        setSame(p1, 100);
        setSame(p2, 200);

        System.out.println(p1.getFirst() + "," + p1.getSecond());
        System.out.println(p2.getFirst() + "," + p2.getSecond());

    }

    private static void setSame(Pair<? super Integer> p, Integer n) {
        p.setFirst(n);
        p.setSecond(n);
    }

    private static void get(Pair<? extends Number> p) {
        Number first = p.getFirst();
        Number second = p.getSecond();
        System.out.println(first + " " + second);
        //p.setFirst(new Integer(first.intValue()));
        //p.setSecond(new Integer(second.intValue()));

    }
}
