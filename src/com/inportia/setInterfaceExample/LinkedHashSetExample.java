package com.inportia.setInterfaceExample;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	LinkedHashSet<String> hs = new LinkedHashSet<String>();
	
	public void addElements(){
		//size, add, remove
		hs.add("Tarun");
		hs.add("Omkar");
		hs.add("inportia");
		hs.add("bros");
		hs.add(null);
		
		}
		
		public void displayElement(){
			
			
			
			for(String s: hs){
				
				System.out.println(s);
			}	
		}
		
		public void removeElement(){
			
			hs.remove(null);
		}

	
}
