package com.cts.NullObject;


public class Employee {
	
	private String name;
	private String destination;
	private double salary;
	
	
	
	public Employee(String name, String destination, double salary) {
		super();
		this.name = name;
		this.destination = destination;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", destination=" + destination + ", salary=" + salary + "]";
	}
	
}
	
