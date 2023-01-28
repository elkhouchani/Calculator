package com.javaoo.calculators;
public class CalculatorDriver {
	
	public static void main (String[] args) {
		System.out.println("Sine = "+TrigonometricCalculator.sine(5));
		System.out.println("Cosine = "+TrigonometricCalculator.cosine(5));
		System.out.println("Tangent = "+TrigonometricCalculator.tangent(5));
		System.out.println("Arcsine = "+TrigonometricCalculator.arcsine(5));
		System.out.println("Arccosine = "+TrigonometricCalculator.arccosine(5));
		System.out.println("Arctangent = "+TrigonometricCalculator.arctangent(5));
	}
}
