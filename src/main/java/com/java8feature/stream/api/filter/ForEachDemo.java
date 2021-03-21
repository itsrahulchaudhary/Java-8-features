package com.java8feature.stream.api.filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maruti");
		list.add("Hyundi");
		list.add("Honda");
		list.add("Suzuki");
		
		for(String ls : list) {
			//System.out.println(ls);
		}

		list.stream().filter((t) -> t.startsWith("H")).forEach((t) -> System.out.println(t));
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		
		map.forEach((key, value) -> System.out.println(key+ " : "+value ));
		// map.entrySet().stream().forEach(obj -> System.out.println(obj));
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj -> System.out.println(obj));
		
	}

}
