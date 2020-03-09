package com.epam.DesignPatterns.DesignPatterns.FactoryPattern;

public class Multiplication implements Calculate{
	public void calculate(float a, float b) {
		System.out.println("multiplication is "+(a*b));
	}

}