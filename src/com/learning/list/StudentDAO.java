package com.learning.list;

import java.util.Arrays;
import java.util.List;

public class StudentDAO {

	public static List<Student> getStudents(){
		
		return Arrays.asList(
				new Student(101, "Rakesh Kumar", "Male", 32, "Developer", "Pune", 55, Arrays.asList("+91 99 4561 6984","+99 74 2536 451")),
				new Student(102, "Amit Ranjan", "Male", 29, "Developer", "Hyd", 88, Arrays.asList("+91 88 6825 6984","+99 76 2356 6859")),
				new Student(103, "Nikhil Kunal", "Male", 23, "Manager", "Pune", 25, Arrays.asList("+91 77 4271 5351","+99 84 4578 4527")),
				new Student(104, "Denesh Jain", "Male", 25, "HR", "Pune", 22, Arrays.asList("+91 82 4521 3658","+99 80 5825 7845")),
				new Student(105, "Pankaj Pathak", "Male", 31, "Developer", "Banglore", 60, Arrays.asList("+91 86 2587 8564","+99 90 0055 7456")),
				new Student(106, "Rampraves Mehta", "Male", 40, "Developer", "Delhi", 11, Arrays.asList("+91 89 6825 5897","+99 99 8866 4523")),
				new Student(107, "Sweta Kumari", "Female", 28, "QA", "Pune", 40, Arrays.asList("+91 77 1453 5123","+99 80 7412 7856")),
				new Student(108, "Sai Palvi", "Femal", 26, "QA", "Pune", 16, Arrays.asList("+91 77 8962 2312","+99 80 5624 7562"))
				);
	}
}
