package com.cts.NullObject;

public class NullEmployee implements Nullref{
	
	private Employee emp;
	
	
	public NullEmployee(Employee emp) {
		
		this.emp = emp;
	}

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public void execute() {
		System.out.println("No Employees where found");
	}
	
}
