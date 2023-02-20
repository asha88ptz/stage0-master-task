package com.epam.OOP;

public class Dog extends Animal {
    public Dog(String color) {
        super(color, 4, true);
    }

    public Dog() {
        this("brown");
    }
}