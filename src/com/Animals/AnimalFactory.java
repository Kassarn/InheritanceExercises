package com.Animals;

public class AnimalFactory {
    public Animal getAnimal(String animal,String name, int age,String gender) {



            switch (animal) {
                case "Animal":
                    return new Animal(name, age, gender);
                case "Cat":
                    return new Cat(name, age, gender);
                case "Dog":
                    return new Dog(name, age, gender);
                case "Frog":
                    return new Frog(name, age, gender);
                case "Kitten":
                    return new Kitten(name, age, gender);
                case "Tomcat":
                    return new Tomcat(name, age, gender);
                default:
                    throw new IllegalArgumentException("Invalid input!");
            }




    }

}
