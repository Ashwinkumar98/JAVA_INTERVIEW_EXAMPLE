package com.cts.toll;

import java.util.ArrayList;
import java.util.List;

public class VehicelType {
	enum Type{
		CAR,BUS,VAN
	}

	public static List<String> getEnums() {
		Type[] types  = Type.values();
			List<String> type = new ArrayList<String>();
			for(Type i : types){
				type.add(i.toString());
			}
		return type;
	}
}
