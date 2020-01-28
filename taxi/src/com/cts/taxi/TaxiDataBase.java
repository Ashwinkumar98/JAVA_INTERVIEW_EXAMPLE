package com.cts.taxi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;


public class TaxiDataBase implements TaxiDAO{
	
	
	private Map<Character, Stack<Taxi>> Tracktaxi;
	
	public TaxiDataBase() {
	
		Tracktaxi = new HashMap<Character,Stack<Taxi>>();
		Tracktaxi.put('A', new Stack<Taxi>());
		Tracktaxi.put('B', new Stack<Taxi>());
		Tracktaxi.put('C', new Stack<Taxi>());
		Tracktaxi.put('D', new Stack<Taxi>());
		Tracktaxi.put('E', new Stack<Taxi>());
		
	}



	@Override
	public List<Taxi> getAllDetails() {
		List<Taxi> taxies = new ArrayList<Taxi>();
		for(Map.Entry <Character, Stack<Taxi>> entry : Tracktaxi.entrySet()) {
			List<Taxi> items=entry.getValue();
			taxies.addAll(items);
		}
		return taxies;
	}

	@Override
	public void addTaxitoLocation(Character point, Taxi taxi) {
		Tracktaxi.get(point).push(taxi);
	}
	
	Taxi findMin(List<Taxi> items) {
		Optional<Taxi> t=items.stream().reduce((t1,t2)->t1.getTotalEarnings()<t2.getTotalEarnings() ? t1 : t2);
		return t.isPresent() ? t.get() : null;
	}

	@Override
	public void removeTaxifromLocation(Character point, Taxi taxi) {
		Tracktaxi.get(point).remove(taxi);
	}

	@Override
	public Taxi getTaxiAtLocation(Character point) {
		if(Tracktaxi.get(point).isEmpty()) {
			return null;
		}
		else if(Tracktaxi.get(point).size()==1) {
			return Tracktaxi.get(point).peek();
		}
		return findMin(Tracktaxi.get(point));
	}

	
}
