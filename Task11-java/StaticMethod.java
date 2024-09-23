package com.index;

public class StaticMethod {
	
	public static int add(int i, int j) {
		return i+j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=2;
		int num2=3;
		int sum=StaticMethod.add(num1, num2);
		System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

	}

}
