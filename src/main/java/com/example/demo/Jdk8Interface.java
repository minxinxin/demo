package com.example.demo;

public interface Jdk8Interface {

	public String getStr();
	
	default void printStr(String str) {
		System.out.println(">>>>>>>"+str);
	}
	
}
