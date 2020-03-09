package com.epam.DesignPatterns.DesignPatterns.SingletonPattern;

public class SingletonClass {
	private static SingletonClass object;
	
	private SingletonClass() {
		
	}
	public static SingletonClass getInstance() {
		if(object == null) {
			object = new SingletonClass();
		}
		return object;
	}

}