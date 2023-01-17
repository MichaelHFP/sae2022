package at.ac.fhwn.sae.lesson2;

import at.ac.fhwn.sae.lesson3.Dog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int number= 42; //this is a comment
        System.out.println(number);

        int constantValue = 1;
        constantValue = 3;//---> mit Shift+FN+F6 kann der Name gleich geändert werden

        boolean result = number != constantValue;
        System.out.println(result);

        if (number > 2){
            System.out.println("number " + number + " is bigger than 2");
        }else{
            System.out.println("number " + number + " is smaller than 2");
        }

        double value = 56.1234231521;

        System.out.println(String.format("value is %.2f",value));


        Scanner in = new Scanner(System.in);
        System.out.print("Enter here:");
        String input = in.next();

        System.out.println("You entered " + input);

        double enteredValue = Double.parseDouble(input);

        Dog dog = new Dog();
        dog.getName();

    }
}
