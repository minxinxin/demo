package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Jdk8 implements Jdk8Interface {

	public static void main(String[] args) {
		Jdk8Interface jdk8 = new Jdk8();
		//接口实现默认方法
		jdk8.printStr(jdk8.getStr());
		//lambda表达式
		List<String> names = Arrays.asList("Peter","James");
//		Collections.sort(names,new Comparator<Object>() {
//			@Override
//			public int compare(Object o1, Object o2) {
//				return 0;
//			}
		
//		});
		Collections.sort(names,(String a,String b) -> {
			return a.compareTo(b);
		});
		Collections.sort(names,(String a,String b) -> a.compareTo(b));
		for (String object : names) {
			System.out.println(object);
		}
		//函数式接口
		Jdk8FuctionalInterface<String,Integer> converter = (form) -> Integer.valueOf(form);
		Integer converted = converter.convert("1");
		System.out.println(converted);
	}

	@Override
	public String getStr() {
		return "jdk8";
	}

}
