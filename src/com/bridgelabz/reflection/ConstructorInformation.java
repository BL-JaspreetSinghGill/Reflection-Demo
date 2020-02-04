package com.bridgelabz.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import com.bridgelabz.reflection.models.User;

public class ConstructorInformation {
	
	public static void main(String[] args) {
		Class c = User.class;
		
		Constructor[] constructorArray = c.getDeclaredConstructors();
		for(Constructor con: constructorArray) {
			System.out.println("CONSTRUCTOR NAME : "+con.getName());
						
			int modifierCount = con.getModifiers();
			System.out.println("MODIFIERS : "+Modifier.toString(modifierCount));
			
			Class[] parametersArray = con.getParameterTypes();
			for(Class parameter: parametersArray) {
				System.out.println("PARAMETER : "+parameter.getName());
			}
			
			Class[] exceptionArray = con.getExceptionTypes();
			for(Class exception: exceptionArray) {
				System.out.println("EXCEPTION : "+exception.getName());
			}
			
			System.out.println("----------------------------");
		}
	}
}