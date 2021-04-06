package com.company;

public interface ISoundable {
    default void makeSound() throws Exception {
        throw new Exception("pidor, ti zabyl realizovat' etot metod");
    };
}
