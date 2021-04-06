package com.company;

public abstract class Animal implements IRunnable, ISoundable {
    public Animal(String name, int legsCount, int eyeCount) {
        this.name = name;
        this.legsCount = legsCount;
        this.eyeCount = eyeCount;
    }

    protected String name;
    protected int legsCount;
    protected int eyeCount;

abstract public void move();

    public void makeSound() {
        System.out.println(name + " is making sound");
    }
}
