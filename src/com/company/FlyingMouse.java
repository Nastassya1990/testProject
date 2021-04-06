package com.company;

public class FlyingMouse extends Animal {
    public FlyingMouse(String name, int legsCount, int eyeCount) {
        super(name, legsCount, eyeCount);
    }

    @Override
    public void move() {
        System.out.println(super.name + " is flying");
    }
}
