package com.learning.list;

import java.util.List;
import java.util.stream.Collectors;

public class SortStudentList {

	/*
	 * Find all student whose live in Pune and sort student name
	 */
	public static void main(String[] args) {
		List<Student> result=StudentDAO.getStudents().stream()
		.filter(student-> student.getCity().equals("Pune"))
		.sorted((s1, s2)-> s1.getName().compareTo(s2.getName()))
		.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
