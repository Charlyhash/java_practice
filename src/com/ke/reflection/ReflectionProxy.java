package com.ke.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ReflectionProxy {
    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")) {
                    System.out.println("Good morning, " + args[0]);
                }

                return null;
            }
        };
    }
}
