package com.bridgelabz.reflection;

import java.lang.reflect.Modifier;

public class ClassInformation {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("com.bridgelabz.reflection.models.Employee");
//		Class c = Employee.class;
		
		System.out.println("CLASS NAME : "+c.getName());
		
		System.out.println("SUPER CLASS : "+c.getSuperclass());
		System.out.println("SUPER CLASS NAME: "+c.getSuperclass().getName());
		
		Class[] interfaceList = c.getInterfaces();
		for (Class i: interfaceList) {
			System.out.println("INTERFACE : "+i.getName());
		}
		
		int modifiersCount = c.getModifiers();
		System.out.println("MODIFIERS : "+Modifier.toString(modifiersCount));
	}
}