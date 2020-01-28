package com.cts.NullObject;

public class RealEmployee implements Nullref {
	
	private Employee emp;
	
	public RealEmployee(Employee emp) {
	
		this.emp = emp;
	}

	@Override
	public boolean isNull() {
		
		return false;
	}

	@Override
	public void execute() {
	
		System.out.println(emp.toString());
	}

}
