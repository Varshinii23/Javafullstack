package com.index;


abstract class Vehicle {
 
 abstract void startEngine();
 abstract void stopEngine();
}

class Car extends Vehicle {
 
 void startEngine() {
     System.out.println("Car engine started.");
 }

 
 void stopEngine() {
     System.out.println("Car engine stopped.");
 }
}


class Motorcycle extends Vehicle {
 
 void startEngine() {
     System.out.println("Motorcycle engine started.");
 }

 @Override
 void stopEngine() {
     System.out.println("Motorcycle engine stopped.");
 }
}

//Main class to test the implementation
public class Vehicle1{
 public static void main(String[] args) {
     Vehicle myCar = new Car();
     Vehicle myMotorcycle = new Motorcycle();

     // Starting and stopping the car engine
     myCar.startEngine();
     myCar.stopEngine();

     // Starting and stopping the motorcycle engine
     myMotorcycle.startEngine();
     myMotorcycle.stopEngine();
 }
}
