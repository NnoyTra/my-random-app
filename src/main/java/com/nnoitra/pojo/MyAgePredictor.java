package com.nnoitra.pojo;

public class MyAgePredictor {

	private String age;
	private String name;
	
	public MyAgePredictor() {}

	public MyAgePredictor(String age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
