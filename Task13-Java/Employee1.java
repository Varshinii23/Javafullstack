package com.index;

public class Employee1 {
   
    private String name;
    private String jobTitle;
    private double salary;

    
    public Employee1(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Method to calculate a salary increase
    public void applyRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        } else {
            System.out.println("Percentage must be positive.");
        }
    }

    // Method to update the salary directly
    public void updateSalary(double newSalary) {
        if (newSalary >= 0) {
            salary = newSalary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Method to get employee details
    public String getDetails() {
        return "Name: " + name +"  "+ "Job Title: " + jobTitle +"  "+ "Salary: " +  salary;
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Create an Employee object
        Employee1 emp = new Employee1("John Doe", "Software Engineer", 70000);

        // Display initial details
        System.out.println("Initial Employee Details:");
        System.out.println(emp.getDetails());

        // Apply a raise of 10%
        emp.applyRaise(10);
        System.out.println("After applying a 10% raise:");
        System.out.println(emp.getDetails());

        // Update the salary directly
        emp.updateSalary(80000);
        System.out.println("After updating salary to 80,000:");
        System.out.println(emp.getDetails());
    }
}
