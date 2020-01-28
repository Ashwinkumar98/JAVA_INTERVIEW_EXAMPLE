package com.cts.NullObject;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private List<Employee> emps;
	
	public Database() {
		emps =new ArrayList<Employee>();
		emps.add(new Employee("Ashwin","PAT",24000));
		emps.add(new Employee("Ragu","SA",85000));
		emps.add(new Employee("Ashwin","A",100000));
	}

	public boolean existingEmp(Employee emp) {
		  
		for(Employee i :  emps) {
			if(i.toString().equals(emp.toString())) {
				return true;
			}
		}
		return false;
	}


}
