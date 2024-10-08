package com.index;


abstract class Shape {
 abstract double calculateArea();
 abstract double calculatePerimeter();
}

//Circle class extending Shape
class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 
 double calculateArea() {
     return Math.PI * radius * radius;
 }


 double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
}


class Triangle extends Shape {
 private double side1;
 private double side2;
 private double side3;

 public Triangle(double side1, double side2, double side3) {
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
 }


 double calculateArea() {
     
     double s = (side1 + side2 + side3) / 2;
     return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }

 double calculatePerimeter() {
     return side1 + side2 + side3;
 }
}


public class Shape1 {
 public static void main(String[] args) {
     
     Shape circle = new Circle(5.0);
     System.out.println("Circle Area: " + circle.calculateArea());
     System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

    
     Shape triangle = new Triangle(3.0, 4.0, 5.0);
     System.out.println("Triangle Area: " + triangle.calculateArea());
     System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
 }
}
