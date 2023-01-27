package com.javaoo.calculators;
import java.lang.Math;

public class ScientificCalculator {
	
	public final static double PI=3.14159;
	private double holdValue;
	
	public static double exp(double param) {
		return Math.exp(param);
	}
	
	public static double log(double param1) {
		return Math.log(param1);
	}
	
	public void putValueInMemory(double newValue) {
		holdValue=newValue;
	}
	
	public double getValueFromMemory() {
		return holdValue;
	}
	
//	public static void main (String[] args) {
//		System.out.println(exp(4));
//		System.out.println(+log(8));
//	}
}
