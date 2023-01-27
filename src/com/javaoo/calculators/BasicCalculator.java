package com.javaoo.calculators;

public class BasicCalculator {
	
	public static double add(double param1,double param2) {
		return param1+param2;
		}
		
		public static double substract(double param1,double param2) {
			return param1-param2;
		}
		
		public static double multiply(double param1,double param2) {
			return param1*param2;
		}
		
		public static double divide(double param1,double param2) {
			return param1/param2;
		}
		
		public static void main(String[] args) {
			System.out.println(add(1,5));
			System.out.println(substract(7.50,5));
			System.out.println(multiply(5,5));
			System.out.println(divide(20,5));	
		}
}
