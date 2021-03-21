package com.java8feature.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		Consumer<Integer> consumer = (t)-> System.out.println("Printing : "+t);
		consumer.accept(100);
		
		List<Integer> list =Arrays.asList(1,3,5,7,8);
		//list.stream().forEach(consumer);
		list.stream().forEach((t)-> System.out.println("Print : "+t));

	 
		
	}

}
