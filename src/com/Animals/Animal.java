package com.Animals;

public  class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        if (name.isEmpty() || name.matches("\\s+")) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age<=0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public void setGender(String gender) {
        if (gender.isEmpty() || gender.matches("\\s+")) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public void produceSound() {
        System.out.println("Not implemented!");
    }

    @Override
    public String toString() {
        return String.format("%s\n%s %s %s", this.getClass().getSimpleName(), this.name, this.age, this.gender);
    }
}