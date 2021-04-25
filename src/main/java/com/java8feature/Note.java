package com.java8feature;

import java.util.LinkedList;
import java.util.List;

public class Note {

	public static void main(String[] args) {

		List<String> note = new LinkedList<String>();
		note.add("1- Lambda");
		note.add("2- functional - [ Consumer, Predicate, Supplier ]");
		note.add("3- stream - [ filter, sort, mapVsflatMap, mapandreduce ]");
		note.add("4- optional");
		note.add("5- parallelStream");
		System.out.println("----------------------------------");
		for (String str : note) {
			System.out.println(str);
		}
		System.out.println("----------------------------------");

	}

}
