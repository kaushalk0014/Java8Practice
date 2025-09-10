package com.revision.clone;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CloneMainTest {

	public static void main(String[] args) {
		
		// DOB: 25 December 1992
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 1992);
		calendar.set(Calendar.MONTH, Calendar.DECEMBER); // Month is zero-based
		calendar.set(Calendar.DAY_OF_MONTH, 25);

		Date dob = calendar.getTime();

		Address address= new Address("Patna", "Bihar", 996633);
		
		Employee employee = new Employee("Pankaj", dob, List.of("9931556600","9931552222"), address);
		
		Employee employeeCopy =employee;
		employeeCopy.setName("Rakesh");
		
		System.out.println(employee);
		System.out.println("After copy object");
		System.out.println(employeeCopy);
		
	}

}
