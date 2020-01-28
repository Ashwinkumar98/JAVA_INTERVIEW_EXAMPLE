package com.cts.main;

public interface ShoppingVisitor {
	
	public double visit(Table table);
	public double visit(Mobile mobile);
	public double visit(Fruits fruits);

}
