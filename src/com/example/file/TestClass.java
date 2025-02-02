package com.example.file;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

public class TestClass {

	public static void main(String[] args) throws JsonProcessingException {
		
		EmployeeService service=new  EmployeeService();
		
		List<Employee> list=service.getRamdomList();
		// convert list to json
		String str= service.convertObjectToJson(list);
		 
		FileUtil fileUtil=new FileUtil(new File("employee.json"));
		fileUtil.writeDataInFile(str);
	}
}
