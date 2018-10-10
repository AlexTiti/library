package com.alex.kotlin.kotlin;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectConstructor {

	public static void main(String[] args) {
		ConstructorExample constructorExample = new ConstructorExample("ABC",10);
		Class<? extends ConstructorExample> classExample = constructorExample.getClass();
		Constructor[] constructors = classExample.getDeclaredConstructors();
		for (int i = 0; i < constructors.length; i++) {
			Constructor constructor = constructors[i];
			if (constructor.isAnnotationPresent(Action.class)){
				System.out.println("包含Action注解");
				Action action = (Action) constructor.getAnnotation(Action.class);
				System.out.println("注解值为 ："+action.action());
			}
			System.out.println("-------------");
		}

		Field[] fields = classExample.getDeclaredFields();
		for (Field f: fields) {
			System.out.println("属性名称 = "+f.getName());
			System.out.println("属性类型 = "+f.getType());
			try {
				if (f.isAnnotationPresent(FieldAnnotation.class)) {
					System.out.println("使用FieldAnnotation注解");
					FieldAnnotation annotation = f.getAnnotation(FieldAnnotation.class);
					System.out.println("FieldAnnotation注解参数：");
					System.out.println("Describe："+annotation.describe());
					System.out.println("Type："+annotation.type());
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("-------------");
		}
	}
}
