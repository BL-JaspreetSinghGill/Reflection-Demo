package com.bridgelabz.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.bridgelabz.reflection.models.Car;

public class MethodInformation {
	
	public static void main(String[] args) {
		Class c = Car.class;
		
		Method[] methodArray = c.getDeclaredMethods();
		for(Method method: methodArray) {
			System.out.println("METHOD NAME : "+method.getName());
			
			System.out.println("RETURN TYPE : "+method.getReturnType().getName());
			
			int modifierCount = method.getModifiers();
			System.out.println("MODIFIERS : "+Modifier.toString(modifierCount));
			
			Class[] parametersArray = method.getParameterTypes();
			for(Class parameter: parametersArray) {
				System.out.println("PARAMETER : "+parameter.getName());
			}
			
			Class[] exceptionArray = method.getExceptionTypes();
			for(Class exception: exceptionArray) {
				System.out.println("EXCEPTION : "+exception.getName());
			}
			
			System.out.println("----------------------------");
		}
	}
}