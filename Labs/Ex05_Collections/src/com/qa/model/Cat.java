package com.qa.model;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Miau";
    }

    @Override
    public String move() {
        return "tab tab tab";
    }

    @Override
    public String toString() {
        return "Cat = " + super.toString();
    }
}
