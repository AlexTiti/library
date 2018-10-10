package com.alex.kotlin.kotlin;

public class ConstructorExample {

	@FieldAnnotation(describe = "名字", type = String.class)
	public String name;
	@FieldAnnotation(describe = "分数", type = int.class)
	protected int core;

	@Action()
	public ConstructorExample(String name, int core) throws NumberFormatException {
		this.core = core;
		this.name = name;
	}
}
