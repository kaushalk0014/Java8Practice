package com.learning.list.map;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		List<User> users = List.of(new User(1L, "Alice"), new User(2L, "Bob"));
		
		Map<Long, List<User>> map=users.stream().collect(Collectors.groupingBy(User::getId, Collectors.toList()));
		System.out.println(map);
		System.out.println("Order Map");
		System.out.println(orderMap());
		
		System.out.println("Order Map 2");
		Map<Long, List<Order>> resultMap = orderMap2();
		
		System.out.println(resultMap.get(1l));
		System.out.println();
		System.out.println("First Index : "+ resultMap.get(1l).get(0));
		System.out.println();
		System.out.println("List size: "+resultMap.get(1l).size());
	}

	private static Map<Long, List<Order>> orderMap() {

		List<Order> orders = List.of(new Order(101L, 1L, 100.0, LocalDate.of(2024, 1, 10)),
				new Order(102L, 1L, 150.0, LocalDate.of(2024, 2, 15)),
				new Order(103L, 2L, 300.0, LocalDate.of(2024, 3, 5)));
		
		Map<Long, List<Order>> map = 
		orders.stream().collect(Collectors.groupingBy(Order::getUserId,Collectors.toList()));
		
		return map;
	}
	
	private static Map<Long, List<Order>> orderMap2() {

		List<Order> orders = List.of(new Order(101L, 1L, 100.0, LocalDate.of(2024, 1, 10)),
				new Order(102L, 1L, 150.0, LocalDate.of(2024, 2, 15)),
				new Order(103L, 2L, 300.0, LocalDate.of(2024, 3, 5)));
		return orders.stream().collect(Collectors.groupingBy(Order::getUserId));
	}
}

class User {
	Long id;
	String name;

	public User() {
	}

	public User(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	

}

class Order {
	Long id;
	Long userId;
	Double total;
	LocalDate orderDate;

	public Order() {
	}

	public Order(Long id, Long userId, Double total, LocalDate orderDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.total = total;
		this.orderDate = orderDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", total=" + total + ", orderDate=" + orderDate + "]";
	}
	
	

}