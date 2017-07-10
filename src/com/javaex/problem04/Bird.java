package com.javaex.problem04;

public abstract class Bird {
    private String name;
    
    public abstract void fly();
    public abstract void sing();
    public abstract void showName();
    public Bird() {}

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
