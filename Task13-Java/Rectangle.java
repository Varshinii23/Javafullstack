package com.index;

public class Rectangle {
    // Attributes for width and height
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

   public double calculateArea() {
        return width * height;
    }

   
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Calculate and display the area and perimeter
        System.out.println("Width: " + rect.width);
        System.out.println("Height: " + rect.height);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}