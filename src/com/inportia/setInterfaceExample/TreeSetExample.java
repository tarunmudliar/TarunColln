package com.inportia.setInterfaceExample;


import java.util.TreeSet;

public class TreeSetExample {

		TreeSet<String> hs = new TreeSet<String>();
	
	public void addElements(){
		//add, remove, higher. lower, floor, ceiling, first, last
		hs.add("Tarun");
		hs.add("~");
		hs.add("Omkar");
		hs.add("inportia");
		hs.add("bros");
		hs.add(null); 
		
		//Will give nullpointer exception while adding null
		
		}
		
		public void displayElement(){
			
			for(String s: hs){
				
				System.out.println(s);
			}	
		}
		
		public void removeElement(){
			
			hs.remove("Tarun");
		}

	
}
