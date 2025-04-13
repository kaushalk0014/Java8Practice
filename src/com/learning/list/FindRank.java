package com.learning.list;

import java.util.List;
import java.util.stream.Collectors;

public class FindRank {

	/*
	 * Find rank whose ranks between 10 to 50
	 */
	
	public static void main(String[] args) {
		List<Student> result=StudentDAO.getStudents().stream()
		.filter(std->std.getRank()>10 && std.getRank()<50).collect(Collectors.toList());
		
		System.out.println(result);
		
		sortByRank();
	}
	
	/* 
	 * Find rank whose ranks between 10 to 50 and sort in ascending order
	 */
	
	private static void sortByRank() {
		System.out.println("-------------------------");
		List<Student> result = StudentDAO.getStudents()
				.stream()
				.sorted((s1, s2) -> s1.getRank()
						.compareTo(s2.getRank()))
				.filter(std -> std.getRank() > 10 && std.getRank() < 50)
				.toList();
				//.collect(Collectors.toList());
		System.out.println(result);
	}
}
