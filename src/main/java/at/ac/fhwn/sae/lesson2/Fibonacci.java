package at.ac.fhwn.sae.lesson2;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number for getting the Fibonacci Number: ");
        String enteredNumber = in.next();
        int parsedNumber = Integer.parseInt(enteredNumber);

        System.out.println("Loop-Result:");
        System.out.println(getFibonacciLoop(parsedNumber));
        System.out.println("Recuriv-Result:");
        System.out.println(getFibonacciRecursiv(parsedNumber));

    }

    /**
     * With getFibonacciLoop you get the Fibonacci Number at a position of your choice
     * Calculating the Fibonacci Number with a Loop
     * returns the Fibonacci Number with a Loop
     */
    public static long getFibonacciLoop(int number){

        int[] intFibonacci = new int[(number+1)];

        intFibonacci[0] = 0;
        intFibonacci[1] = 1;

        for (int i = 1; i < number; i++){
            int oldNumber = -1 + i;
            int newNumber = intFibonacci[oldNumber] + intFibonacci[i];

            int addNumber = 1+i;
            intFibonacci[addNumber] = newNumber;

        }
        return intFibonacci[number];
    }

    /**
     * With getFibonacciRecursiv you get the Fibonacci Number at a position of your choice
     * Calculating the Fibonacci Number with a Recursiv Function
     * returns the Fibonacci Number with a Recursiv Function
     */
    public static long getFibonacciRecursiv(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return getFibonacciRecursiv(--number, 0, 1);
    }

    public static long getFibonacciRecursiv(int number, int oldNumber, int newNumber){
        while (number > 0){
            return getFibonacciRecursiv(--number, oldNumber + newNumber, oldNumber);
        }
        return  oldNumber + newNumber;
    }

/*Bei meinen Funktionen kommt es ab der 47.Stelle zu einem ValueOverflow, dass bedeutet, das ab hier keine korrekte Ausgabe mehr möglich ist bei beiden Funktion, sprich Recursiv und Loop
*Ab der 17783. Stelle kommt es bei der Recuriven Funktion zu ein StackOverflow
*Beim Loop gibt es keinen StackOverflow, da tritt der erste Fehler bei 10 Milliarden auf einem Exception in thread "main".
*Wenn eine negative Zahl eingegen wird kommt es beim Loop sofort zu einem Fehler, da es im Array keine Minus Stellen gibt
* Anders bei der Recursion kommt es aufgrund der Auslegung der Funktion zur Rückgabe von oldNumber+newNumber, welche immer -1 ergibt.
* Das ist so lange der Fall bis es ebenfalls zu einem Exception in thread in der "main" kommt und das ist ab -10 Milliarden*/

}
