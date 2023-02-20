package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public String getDescription() {
        String furArticle = hasFur ? "a" : "no";
        String paws = numberOfPaws == 1 ? "paw" : "paws";
        String descriptionPattern = "This animal is mostly %s. It has %d %s and %s fur.";
        return String.format(descriptionPattern, color, numberOfPaws, paws, furArticle);
    }
}