package com.java8feature.stream.api.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8feature.stream.api.filter.exp.DataBase;
import com.java8feature.stream.api.filter.exp.Employee;

public class SortListDemo2 {

	public static void main(String[] args) {
		
		List<Employee> employees = DataBase.getEmployees();
		// Type-1
		//Collections.sort(employees, new MyComparator());
		
		// Type-2
		Collections.sort(employees, (o1, o2)->(int)(o1.getSalary()-o2.getSalary()));
	
		System.out.println(employees);
		
		// Type-3
		employees.stream().sorted((o1, o2)->(int)(o1.getSalary()-o2.getSalary())).forEach(System.out::println);
		
		// Type-4
		employees.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
		
		// Type-5
		employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);
		
		
	}
}
/*
class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary() - o2.getSalary());// asc
	}

}
*/