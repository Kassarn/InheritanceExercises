package com.Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try {

           String[] studentLine = reader.readLine().split("\\s+");
           String studentFirstName = studentLine[0];
           String studentLastName = studentLine[1];
           String facNumber = studentLine[2];

           Student student = new Student(studentFirstName, studentLastName, facNumber);

           String[] workerLine = reader.readLine().split("\\s+");
           String workerFirstName = workerLine[0];
           String workerLastName = workerLine[1];
           double weekSalary = Double.parseDouble(workerLine[2]);
           double workPerHour = Double.parseDouble(workerLine[3]);

           Worker worker = new Worker(workerFirstName, workerLastName, weekSalary, workPerHour);

           System.out.println(student.toString());
           System.out.println(worker.toString());

       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }

    }
}
