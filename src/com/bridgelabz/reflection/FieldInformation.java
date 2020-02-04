package com.bridgelabz.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.bridgelabz.reflection.models.Student;

public class FieldInformation {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Student student = new Student();
		Class c = student.getClass();
		
		Field[] fieldArray = c.getDeclaredFields(); // for public
//		Field[] fieldArray = c.getFields(); // for all
		for(Field field: fieldArray) {
			System.out.println("FIELD NAME : "+field.getName());
			
			System.out.println("FIELD TYPE : "+field.getType().getName());
			
			int modifierCount = field.getModifiers();
			System.out.println("MODIFIERS : "+Modifier.toString(modifierCount));
			
			System.out.println("FIELD VALUE : "+ field.get(field));
			System.out.println("----------------------------");
		}
		
	}

}
