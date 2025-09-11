package com.revision.list.to.map;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringNameToMap {

	public static void main(String[] args) {
		List<String> list= List.of("Pankaj","David","Lisa","Rakesh","Suresh", "Pankaj", "Suresh", 
				"Lisa");
		
		
		list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.forEach((k,v)->System.out.println(k+" : "+v));
		
		list.stream().collect(Collectors.toMap(Function.identity(), v->1L, Long::sum))
		.forEach((key, value)->{
			System.out.println(key+" : "+value);
		});
		
		
	}
}
