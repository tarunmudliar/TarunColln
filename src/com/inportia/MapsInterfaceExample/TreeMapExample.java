package com.inportia.MapsInterfaceExample;

import java.util.TreeMap;

public class TreeMapExample {
	TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
	
	
	public void add(){
		//Cant
		//tm.put(null, "tarun");
		//descendingkeyset, descendingmap
		tm.put(0, "Tarun");
		tm.put(1, "devraj");
	
	}
	
	
	public void get(){
		
		for (int i =0; i<tm.size(); i++){
			
			System.out.println(tm.get(i));
		}
		
	}
}
