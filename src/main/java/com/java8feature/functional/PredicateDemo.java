package com.java8feature.functional;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (t) -> t % 2 == 0;
		System.out.println(predicate.test(8));
		
		List<Integer> list =Arrays.asList(1,3,5,7,8,20);
		//list.stream().filter(predicate).forEach((t)-> System.out.println("Print Even : "+t));
		
		list.stream().filter((t) -> t % 2 == 0).forEach((t)-> System.out.println("Print Even : "+t));
	}

}
