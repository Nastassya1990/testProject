package com.company;

public class Dog extends Animal {
    public Dog(String name, int legCount, int eyeCount) {
        super(name, legCount, eyeCount);
    }

    @Override
    public void move() {
        System.out.println(name + " is running");
    }
}
