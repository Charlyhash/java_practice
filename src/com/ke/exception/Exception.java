package com.ke.exception;

import java.io.UnsupportedEncodingException;

/*
* Java规定：
* 1. 必须捕获的异常：Exception及其子类，但是不包括RuntimeException及其子类
* 2. 不需要捕获的异常，包括Error及其子类，RuntimeException及其子类
* */
public class Exception {
    public static void main(String[] args) {
        byte[] bs = toGBK("中文");
    }

    private static byte[] toGBK(String s) {
        try {
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            System.out.println(e);
            return s.getBytes();
        }
    }
}
