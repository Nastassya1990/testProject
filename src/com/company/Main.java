package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
//        Base val = new Base();
//        val.a = 2;
//        val.doSomething();
//
//        Child1 val1 = new Child1();
//        val1.a = 3;
//        val1.str="asd";
//        val1.doSomething();
        Dog leha = new Dog("Aleksey", 4, 2);
        FlyingMouse nastja = new FlyingMouse("Nastja", 2, 2);
        leha.move();
        nastja.move();
        Car renault = new Car();
        renault.makeSound();
        sound(leha);
        sound(nastja);
    }
    static void sound(ISoundable iSoundable) throws Exception {
        iSoundable.makeSound();
    }
}
