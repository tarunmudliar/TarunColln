package com.inportia.listInterfaceExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ArrayListExample {

	static List<String> ale = new ArrayList<String>();
	// ArrayList<linkedListExample> ALE = new ArrayList<linkedListExample>();
	ArrayList<Integer> ned = new ArrayList<Integer>();

	public static void addElements() {
		// add, set, remove, get , listiterator, size
		ale.add("Tarun");
		ale.add("Omkar");
		ale.add("inportia");
		ale.add("bros");
		ale.add(1, "another");
		ale.add("Tarun");
		ale.add("Omkar");
		

		class fo {

			public void yo() {

				System.out.println("jhd");
			}
		}

	}

	public void displayElement() {

		ListIterator li = ale.listIterator();
		Iterator<Integer> i = ned.iterator();

		while (li.hasNext()) {

			System.out.println(li.next());
		}
		/*
		 * for(String s: ale){
		 * 
		 * System.out.println(s); }
		 */
		
	}

	public void removeElement() {

		ale.remove(0);
	}

	public void countDup() {
		addElements();
		HashSet<String> hs = new HashSet<String>(ale);
		ArrayList<String> al = new ArrayList<>();
		al.addAll(hs);
		for (int i = 0; i < al.size(); i++) {
			int count = 0;
			for (int j = 0; j < ale.size(); j++) {

				if (al.get(i) == ale.get(j)) {
					count++;

				}
			}
			System.out.println("Count of " + al.get(i) + " is " + count);
		}

	}

	public void countDup2() {
		addElements();
		HashSet<String> hs = new HashSet<String>(ale);
		for (String o : hs) {
			System.out.println(o + ": " + Collections.frequency(ale, o));
			
		}

	}

	public void countDup3() {
		addElements();
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String temp : ale) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		printMap(map);

		System.out.println("\nSorted Map");
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);
		printMap(treeMap);
	}

	public static void printMap(Map<String, Integer> map) {

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

	}
}
