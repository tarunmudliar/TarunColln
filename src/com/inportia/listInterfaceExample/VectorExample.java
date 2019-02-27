package com.inportia.listInterfaceExample;

import java.util.Vector;

public class VectorExample {
	/*The params 3 and 7 indicate that, when the 4th element is added,
	the capacity will increase by 7, i.e. will become 10
	Otherwise, initial capacity is 10 for all. And it indrease by 10, when 11th element is added.
	If param is 3 the it will become 3 more if 4th elem added.
	*/
	Vector<Integer> vv = new Vector<Integer>(3, 7);
	
	public void addElements(){
		
		vv.add(1);
		vv.add(2);
		vv.add(3);
		vv.add(4);
		int i = vv.capacity();
		
		System.out.println(i);
		}
		
		public void displayElement(){
			
			
			
			for(Integer s: vv){
				
				System.out.println(s);
			}	
		}
		
		public void removeElement(){
			
			vv.remove(0);
		}
	
}
