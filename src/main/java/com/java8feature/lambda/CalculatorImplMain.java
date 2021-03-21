package com.java8feature.lambda;


interface Calculator{
	//void switchOn();
	//void sum(int n);
	int substract(int i1, int i2);
}

public class CalculatorImplMain {
	
	// () -> { body };
	
	 public static void main(String[] args) {
		 
		 /*
		  Calculator cal = () ->System.out.println("Switch is On...");
		  cal.switchOn();
		 */
		 
		 /*
		  Calculator cal2 = (n) -> System.out.println("sum is : "+n);
		  cal2.sum(100);
		 */
		 
		 /*
		  Calculator cal3 = (i1, i2) -> (i2-i1);
		  System.out.println(cal3.substract(10, 70));
		 */
		 
		 Calculator cal3 = (i1, i2) -> {
			 if(i2<i1) {
				 throw new RuntimeException("message");
			 }else {
				 return (i2-i1);
			 }
		 };
		 System.out.println(cal3.substract(20, 70));
		 
		 
	}

}
