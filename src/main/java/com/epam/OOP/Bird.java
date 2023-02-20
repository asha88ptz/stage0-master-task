package com.epam.OOP;

public class Bird extends Animal {
    public Bird(String color) {
        super(color, 2, false);
    }
    public Bird() {
        this("blue");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Moreover, it has 2 wings and can fly.";
    }

    //"This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly."
}