package com.Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        AnimalFactory factory =  new AnimalFactory();
        String line= "";
        while (!"Beast!".equals(line =reader.readLine())) {
            try {
                String[] animalTokens = reader.readLine().split(" ");
                String  name  = animalTokens[0];
                int age = Integer.parseInt(animalTokens[1]);
                String gender = animalTokens[2];

                Animal animal = factory.getAnimal(line, name,age ,gender);
                System.out.println(animal);
                animal.produceSound();

            }catch (Exception e){

                System.out.println("Invalid input!");
            }
        }
    }
}
