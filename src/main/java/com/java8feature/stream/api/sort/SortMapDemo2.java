package com.java8feature.stream.api.sort;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.java8feature.stream.api.filter.exp.Employee;

public class SortMapDemo2 {
	
	public static void main(String[] args) {
		
		/*
		Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary()-o2.getSalary());
			}
		});
		*/
		
		// using Lambda
		Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
		employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
		employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
		employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
		employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
		employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);

		System.out.println(employeeMap);
		System.err.println("------------------------------------------");
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println);
		System.err.println("------------------------------------------");
		employeeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
				.forEach(System.out::println);

	}

}
