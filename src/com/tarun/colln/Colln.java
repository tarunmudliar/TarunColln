package com.tarun.colln;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class Colln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c = new LinkedHashSet<String>();
		List<String> g = new ArrayList<String>(c);
		g.add("tarun");
		g.add("kailash");
		Iterator<String> t = g.iterator();
		while(t.hasNext()){
			
			System.out.println(t.next());
		}
		ArrayList<String> a = new ArrayList<>();
		
		
		}

}
