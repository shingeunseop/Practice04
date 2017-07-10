package com.javaex.problem04;

public abstract class Bird {
    private String name;
    
    abstract void fly();
    abstract void sing();
    abstract void showName();

	public Bird(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    



}
