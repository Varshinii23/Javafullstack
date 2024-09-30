package com.index;


abstract class Person1 {
 
 abstract void eat();
 abstract void exercise();
}


class Athlete extends Person1 {
 
 void eat() {
     System.out.println("Athlete eats a balanced diet rich in proteins and carbs.");
 }


 void exercise() {
     System.out.println("Athlete trains for several hours daily, focusing on strength and endurance.");
 }
}


class LazyPerson extends Person1 {

 void eat() {
     System.out.println("Lazy person prefers fast food and snacks for convenience.");
 }


 void exercise() {
     System.out.println("Lazy person rarely exercises and prefers lounging on the couch.");
 }
}


public class Person2 {
 public static void main(String[] args) {
     Person1 athlete = new Athlete();
     Person1 lazyPerson = new LazyPerson();

     // Athlete's activities
     System.out.println("Athlete:");
     athlete.eat();
     athlete.exercise();

     // Lazy person's activities
     System.out.println("\nLazy Person:");
     lazyPerson.eat();
     lazyPerson.exercise();
 }
}
