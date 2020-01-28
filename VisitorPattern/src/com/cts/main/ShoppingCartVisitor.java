package com.cts.main;

public class ShoppingCartVisitor implements ShoppingVisitor {

	@Override
	public double visit(Table table) {
		
		return table.getPrice();
	}

	@Override
	public double visit(Mobile mobile) {
		
		return mobile.getPrice();
	}

	@Override
	public double visit(Fruits fruits) {
		
		return fruits.getPrice();
	}
	
	
}
