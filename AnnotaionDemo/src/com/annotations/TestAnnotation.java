package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAnnotation {
	
	@MyAnnotations(value=1234567890)
	@MyDate(month = "August", day = 13, year = 2018)
	@PerformOperation()
	public static void disp() {
		// TODO Auto-generated method stub
		System.out.println("display");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAnnotation test = new TestAnnotation();
		Class class1 = test.getClass();
		
		Method[] methods = class1.getMethods();
		for(Method method:methods) {
			Annotation[] annotations = method.getAnnotations();
		
			for(Annotation anno: annotations) {
				if(anno.annotationType().equals(MyDate.class)) {
					MyDate m =(MyDate)anno;
					int day = m.day();
					System.out.println(day);
				}
				if(anno.annotationType().equals(PerformOperation.class)) {
					PerformOperation p = (PerformOperation) anno;
					int v1 = p.value1();
					int v2 = p.value2();
					System.out.println(v1+v2);
				}
			}
		}
		
		
		
		

	}

}
