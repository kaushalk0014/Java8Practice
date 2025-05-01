package com.learning.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		 String input = "i am an india";
		 
		 input=input.toLowerCase().replace(" ", "");
		 
		 Map<String, Long> result=Stream.of(input.split(""))
		 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		 
		 result.forEach((k, v)->{
			 System.out.println("Key : "+k   +"  Value : "+v);
		 });
		 
		 Optional<String> findFirst=
				 result.entrySet().stream().filter(m->m.getValue()==1).map(Map.Entry::getKey).findFirst();
		 
		 System.out.println(findFirst.get());
		 
	}
}
