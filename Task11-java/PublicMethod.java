package com.index;

public class PublicMethod {
	public int sum(int i,int j) 
	{
		
		return i+j;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PublicMethod p=new PublicMethod();
		int num1=2;
		int num2=3;
		int add=p.sum(num1, num2);
		System.out.println("The sum of " + num1 + " and " + num2 + " is: " + add);
	}

}
