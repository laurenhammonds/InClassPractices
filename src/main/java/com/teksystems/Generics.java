package com.teksystems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generics {
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("String 1");
		list1.add("String 2");
		list1.add("String 3");
		
		// prints what is in list 1
		printList(list1);
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("String 4");
		list2.add("String 5");
		list2.add("String 6");
		
		// prints what is in list 2
		printList(list2);
				
		// this will add all from list 2 to list 1
		list1.addAll(list2);
		
		//prints what is in list 1
		printList(list1);
		
		//remove the first item from the list
		list1.remove(4);
		printList(list1);
		
		String a = list1.get(3);
		System.out.println("a = " + a);
		
		// contains
		if ( list1.contains("String 1") ) {
			System.out.println("List 1 contains String 1");
	}
		
		//insert at a position in the list
		list1.add(1, "Inserted String");
		printList(list1);
	}
	
	public static void printList(List<String> list) {
		System.out.println("====================");
		for ( String s : list) {
			System.out.println(s);
		}
	}
}
