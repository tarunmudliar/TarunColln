package com.inportia.listInterfaceExample;

import java.util.LinkedList;

public class LinkedListExample {

	LinkedList<Integer> ff = new LinkedList<Integer>();
		
	
	public void addElements(){
		//add, set, push, remove, pop-poll, get, element-peek, offer 
	
		ff.add(1);
		ff.add(2);
		ff.add(3);
		ff.add(4);
		
		}
		
		public void displayElement(){
			
			for(Integer s: ff){
				
				System.out.println(s);
			}	
		}
		
		public void removeElement(){
			
			ff.remove(0);
		}

	
}
