package com.qa.model;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Wuff";
    }

    @Override
    public String move() {
        return "run run run";
    }

    @Override
    public String toString() {
        return "Dog = " + super.toString();
    }
}
