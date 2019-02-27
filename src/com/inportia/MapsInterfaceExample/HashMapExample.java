package com.inportia.MapsInterfaceExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	
	public void addElements(){
		//put, replace, remove, get, keySet, values, isEmpty, 
		//clear, clone, containsKey, containsValue
		//no iterator
		hm.put(1, "Tarun");
		hm.put(2, "Omkar");
		hm.put(3, "Bros");
		hm.put(4, "inportia");
		hm.put(5, null);
		hm.put(4, "good");
		hm.put(null, null);
		
		
		//hm.put(4, "inportia"); wont add
		
		
		}
		
		public void displayElement(){
			
			//System.out.println(hm);
			Set<Integer> uu = hm.keySet();
			
			for(Integer i: uu){
				
				System.out.println(i);
				System.out.println(hm.get(i));		
				}
			
		}
		
		public void removeElement(){
			
			hm.remove(1);
			
		}
		public void combineMaps(){
			
			HashMap<Integer, String> m = new HashMap<Integer, String>();
			m.put(1, "Tarun");
			m.put(2, "Mudaliar");
			m.put(3, "Cool");
			HashMap<Integer, String> g = new HashMap<Integer, String>();
			g.put(1, "Great");
			g.put(5, "Awesome");
			g.put(6, "Joker");

			g.putAll(m);
			
			
			Set<Integer> s = g.keySet();
			for(Integer y: s){
				
				System.out.println(g.get(y));
			}
			
		}
	
}
