package com.index;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		String name;
		int id;
		float sal;
		String add;
		int pin;
		
		System.out.println("what is employee name");
		Scanner scan=new Scanner(System.in);
		name=scan.nextLine();
		System.out.println("what is employee id");
		id=scan.nextInt();
		System.out.println("what is employee salary");
		sal=scan.nextFloat();
		System.out.println("what is employee address");
		add=scan.nextLine();
		System.out.println("what is employee pincode");
		pin=scan.nextInt();
		
	
		
		System.out.println("Employee name:" + name);
		System.out.println("Employee id:" + id);
		System.out.println("Employee salary:"+ sal);
		System.out.println("Employee address:" + add);
		System.out.println("Employee pincode:" + pin);
	}

}
