package com.cts.NullObject;

public class App {

	public static void main(String[] args) {
		
		CustomerFactory fact =  new CustomerFactory();
		fact.getEmployee(new Employee("Ashwin","PAT",24000)).execute();
	}

}
