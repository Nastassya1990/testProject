package com.company;

public class Child1 extends Base{
    public String str = "привет ";
    protected void doSomething() {
        System.out.println(str + a);
    }
}
