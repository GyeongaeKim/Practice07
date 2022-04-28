package com.javaex.ex03;

public class Cat implements Soundable {
	
	public String sound = "야옹";
	
	
	@Override
	public String sound() {
		System.out.println(sound);
		return null;
	}


}
