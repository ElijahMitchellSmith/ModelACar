package com.company;

public class Person {
    private char gender;
    private String hairColor;
    private String eyeColor;
    private String height;

    public Person(char gender, String hairColor, String eyeColor, String height) {
        this.gender = gender;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
