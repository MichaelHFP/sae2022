package at.ac.fhwn.sae.lesson1;

import java.util.Scanner;

public class BMICalculator_Butzenlechner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter here your height in cm:");
        String height = in.next();

        System.out.print("Enter here your weight in kg:");
        String weight = in.next();

        double enteredHeight = Double.parseDouble(height)/100;
        double enteredWeight = Double.parseDouble(weight);

        double calculatedBmi = enteredWeight / Math.pow(enteredHeight,2);

        System.out.println(String.format("Your bodymassindex is %.2f",calculatedBmi));

        if (calculatedBmi < 18.5) {
            System.out.println("You are underweight!");
        }else if (calculatedBmi < 25) {
            System.out.println("You have normal weight!");
        }else if (calculatedBmi < 30) {
            System.out.println("You are slightly overweight!");
        }else if (calculatedBmi < 35) {
            System.out.println("You are overweight!");
        }else if (calculatedBmi < 40) {
            System.out.println("You are severe overweight!");
        }else {
            System.out.println("You are very overweight!");
        }

    }

}
