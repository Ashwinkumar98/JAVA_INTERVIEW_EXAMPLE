package com.cts.toll;

import java.util.ArrayList;
import java.util.List;


public class Customer {
	enum User{
		Normal,VIP
	}
	
	public static List<String> getEnums() {
		User[] types  = User.values();
			List<String> type = new ArrayList<String>();
			for(User i : types){
				type.add(i.toString());
			}
		return type;
	}
}
