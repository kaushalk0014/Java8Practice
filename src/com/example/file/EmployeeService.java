package com.example.file;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeService {

	public List<Employee> getRamdomList() throws JsonProcessingException {

		List<Employee> list = new ArrayList<Employee>();
		int min = 50000;
		int max = 80000;

		for (int i = 0; i < 1000; i++) {
			list.add(new Employee(101 + i, "Spring_" + i + 1, "Developer", new Random().nextInt(max - min + 1) + min));
		}
		return list;
	}

	public <T> String convertObjectToJson(T t) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(t);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

}
