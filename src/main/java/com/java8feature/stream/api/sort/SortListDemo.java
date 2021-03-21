package com.java8feature.stream.api.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortListDemo {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(20);
		list.add(70);
		list.add(40);
		list.add(90);
		
		Collections.sort(list); //ascending
		Collections.reverse(list);

		System.out.println(list);
		
		//list.stream().sorted().forEach(t->System.out.println(t));
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));
		
	}

}
