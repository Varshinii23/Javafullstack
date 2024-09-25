package com.index;

public class Person {
	String name;
	int age;
	
	public Person( String n) {
		name=n;
		System.out.println("Name:"+ name);
	}

	public Person(int a) {
		
		age=a;
		System.out.println("Age:"+ age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person("varsh");
		Person p2=new Person(21);
		

	}

}
