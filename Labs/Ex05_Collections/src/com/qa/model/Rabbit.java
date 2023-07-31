package com.qa.model;

public class Rabbit extends Animal {
    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "snuff";
    }

    @Override
    public String move() {
        return "jump jump jump";
    }

    @Override
    public String toString() {
        return "Rabbit = " + super.toString();
    }
}
