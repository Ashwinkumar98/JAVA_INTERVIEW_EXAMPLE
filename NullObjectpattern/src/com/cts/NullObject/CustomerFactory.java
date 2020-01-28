package com.cts.NullObject;

public class CustomerFactory {
	
	private Database database;
	public CustomerFactory() {
		database = new Database();
		
	}
	
	public Nullref getEmployee(Employee emp) {
		
		if(checkEmp(emp)) {
			return new RealEmployee(emp);
		}
		
		return new NullEmployee(emp);
	}
	
	public boolean checkEmp(Employee emp) {
		
		if(database.existingEmp(emp)) {
			return true;
		}
		
		return false;
	}
	

}
