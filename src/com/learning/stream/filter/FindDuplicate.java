package com.learning.stream.filter;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Spring");
		list.add("Hibernate");
		list.add("Java");
		list.add("React");
		list.add("Java");
		list.add("Angular");
		list.add("Splunk");
		list.add("Splunk");
		list.add("JavaScript");
		list.add("Hibernate");
		
		System.out.println(list);
		List<String> result=list.stream().distinct().toList();
		System.out.println(result);
	}
}
