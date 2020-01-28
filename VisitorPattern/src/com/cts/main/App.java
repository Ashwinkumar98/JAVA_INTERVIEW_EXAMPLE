package com.cts.main;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<ShoppingCart> items = new ArrayList<>();
		items.add(new Table("Tablemate", 109.32));
		items.add(new Mobile("Samsung Galaxy M6", 20000.32));
		items.add(new Fruits("Mango", 120));
		items.add(new Table("Apple", 150.55));
		
		double sum = 0;
		
		ShoppingVisitor visitor = new ShoppingCartVisitor();
		
		for(ShoppingCart i : items) {
			sum+=i.accept(visitor);
		}
		
		System.out.println(sum);
	}

}
