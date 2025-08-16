package com.learning.list.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortMapByDeptName {

	public static void main(String[] args) {

		Map<String, Employee> empDetails = new HashMap<String, Employee>();

		empDetails.put("Fin", new Employee(101, "Kaushal"));
		empDetails.put("HR", new Employee(105, "Roshan"));
		empDetails.put("Dev", new Employee(103, "Pankaj"));
		empDetails.put("DevOps", new Employee(108, "Akash"));

		Map<String, Employee> resultAscOrder =
				empDetails.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue((o1, o2) ->o1.getName().compareTo( o2.getName())))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)->e1,
				LinkedHashMap::new));
		
		
		System.out.println("Result : "+ resultAscOrder);
		
		
		System.out.println("----  Desc order sorting ---");
		Map<String, Employee> resultDescOrder =
		empDetails.entrySet().stream()
		.sorted((e1, e2)-> e2.getValue().getName().compareTo(e1.getValue().getName()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry :: getValue, (o1, o2) -> o1, LinkedHashMap::new));
	
		System.out.println(resultDescOrder);
	}

}

class Employee {
	private Integer empId;
	private String name;

	public Employee(Integer empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public Employee() {
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
}