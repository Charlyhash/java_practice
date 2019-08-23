package com.ke.oop.a07static;

public class Person {

	// TODO

	String name;
	public static int count = 0;

	public Person(String name) {
		this.name = name;
		count++;
	}

	public static int getCount() {
		return count;
	}
}
