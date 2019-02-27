package com.inportia.setInterfaceExample;

import java.util.HashSet;

public class HashSetExample {

		HashSet<String> hs = new HashSet<String>();
		
		
		
		public void addElements(){
			//contains, add, remove
			hs.add("Tarun");
			hs.add("Omkar");
			hs.add("inportia");
			hs.add("bros");
			hs.add("null");
			hs.add(null);
			hs.add("Tarun");
			
			}
		
			public void displayElement(){
				
				for(String s: hs){
					
					System.out.println(s);
				}	
			}
			
			public void removeElement(){
				
				hs.remove("null");
			}

	
}
