package com.inportia.MapsInterfaceExample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
	LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
	
	public void add(){
	
		lhm.put("Gold", "Digger");
		lhm.putIfAbsent("No", "Yes");
		lhm.put(null, null);
		
	}
	
	public void get(){
		System.out.println(lhm.get(null));
		Set<String> it = lhm.keySet();
		
		for(String x: it){
			System.out.println(lhm.get(x));
			
		}
	}
	
	
}
