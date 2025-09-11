package com.revision.list.to.map;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountRepetation {

	public static void main(String[] args) {
		List<String> list= List.of("Pankaj","David","Lisa","Rakesh","Suresh", "Pankaj", "Suresh", 
				"Lisa");
		
		Map<String, Long> map= list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter((m)->m.getValue()>1)
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		
		map.forEach((key,value)-> System.out.println("Key : "+key+"   Value : "+value));
	}
}
