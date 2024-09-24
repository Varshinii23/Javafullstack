package com.index;

public class Dog {
	
	String name;
	String color;
	
	public Dog(String n,String c) {
		name=n;
		color=c;
		
	}
	void display() {
		System.out.println("Dog name:"+ name);
		System.out.println("Dog color:"+ color);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog("sheero","white");
		d.display();
         
         
	}

}
