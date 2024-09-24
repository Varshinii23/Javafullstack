package com.index;

public class QueOne {
	int id;
	String name;
	int age;
	String designation;
	
	public QueOne(int i,String n,int a,String d) {
		id=i;
		name=n;
		age=a;
		designation=d;
		System.out.println("Employee id:"+ id);
		System.out.println("Employee name:"+ name);
		System.out.println("Employee age:"+ age);
		System.out.println("Employee designation:"+ designation);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueOne obj=new QueOne(001,"varsh",23,"software developer");
		

	}

}
