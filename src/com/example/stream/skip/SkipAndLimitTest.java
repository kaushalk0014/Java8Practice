package com.example.stream.skip;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SkipAndLimitTest {
 public static void main(String[] args) {

	 List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	 
	 list.stream()
	 .skip(1)
	 .limit(7)
	 .forEach(System.out::println);
	 
	 System.out.println("---------------------------------------\n");
	 
	 try {
		List<String> data=Files.readAllLines(Paths.get("data.txt"));
		// Ignore header and and total calculation
		data.stream()
		.skip(1)
		.limit(data.size()-2).forEach(System.out::println);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}

