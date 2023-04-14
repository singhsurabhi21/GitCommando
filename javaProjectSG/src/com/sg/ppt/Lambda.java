package com.sg.ppt;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class Lambda {
	  public static void main(String[] args) {
	    List<String> names = new ArrayList<>();
	    names.add("John");
	    names.add("Mary");
	    names.add("Alex");

	    // Sorting the list using a lambda expression
	    Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

	    System.out.println(names); // Output: [Alex, John, Mary]
	  }
	}


