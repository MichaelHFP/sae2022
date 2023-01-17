package at.ac.fhwn.sae.lesson3.excercise3;

import at.ac.fhwn.sae.lesson3.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalFarm {

    public static void main (String [] args){

        Scanner in = new Scanner(System.in);
        System.out.println("    Animal Farm");
        System.out.println("Was möchten Sie tun?");
        System.out.println(" ");
        System.out.println(String.format("%-5s","1.") + "Tier hinzufügen");
        System.out.println(String.format("%-5s","2.") + "Tiere anzeigen");
        System.out.println(String.format("%-5s","3.") + "Tiere nach Art anzeigen");
        System.out.println(String.format("%-5s","4.") + "Tier entfernen");
        System.out.println(String.format("%-5s","5.") + "Programm beenden");

        String enteredNumber = in.next();
        int parsedNumber = Integer.parseInt(enteredNumber);

        List<Animal> lifestock = new ArrayList();

        while (parsedNumber < 5){
            if (parsedNumber == 1){
                Scanner in2 = new Scanner(System.in);
                System.out.println("             Animal Farm");
                System.out.println("Welche Tierart wollen Sie hinzufügen?");
                System.out.println(" ");
                System.out.println(String.format("%-5s","1.") + "Pferd");
                System.out.println(String.format("%-5s","2.") + "Kuh");
                System.out.println(String.format("%-5s","3.") + "Schwein");
                System.out.println(String.format("%-5s","4.") + "Huhn");
                String enteredNumber2 = in.next();
                int parsedNumber2 = Integer.parseInt(enteredNumber2);

                if (parsedNumber2 == 1){
                    Horse horse = new Horse();

                    Scanner horseName = new Scanner(System.in);
                    System.out.println("Bitte geben Sie einen Name für ihr Pferd ein: ");
                    String enteredHorseName = in.next();

                    lifestock.add(horse);
                    horse.setName(enteredHorseName);
                }else if (parsedNumber2 == 2){
                    Cow cow = new Cow();

                    Scanner cowName = new Scanner(System.in);
                    System.out.println("Bitte geben Sie einen Name für ihr Kuh ein: ");
                    String enteredCowName = in.next();

                    lifestock.add(cow);
                    cow.setName(enteredCowName);
                }else if (parsedNumber2 == 3){
                    Pig pig = new Pig();

                    Scanner pigName = new Scanner(System.in);
                    System.out.println("Bitte geben Sie einen Name für ihr Schwein ein: ");
                    String enteredPigName = in.next();

                    lifestock.add(pig);
                    pig.setName(enteredPigName);
                }else if (parsedNumber2 == 4){
                    Chicken chicken = new Chicken();

                    Scanner chickenName = new Scanner(System.in);
                    System.out.println("Bitte geben Sie einen Name für ihr Pferd ein: ");
                    String enteredChickenName = in.next();

                    lifestock.add(chicken);
                    chicken.setName(enteredChickenName);
                }else{
                    System.out.println("Fehler bei der Eingabe");
                }

            }

            if (parsedNumber == 2){
                System.out.println(String.format("%-3s","Nr.") + "|" + String.format("%-4s","ID") + "|" + String.format("%-8s","Name"));
                System.out.println("__________________");

                int numbering = 0;

                for (Animal animal : lifestock) {

                    numbering++;
                    System.out.println(String.format("%-3s",String.valueOf(numbering)) + "|" + String.format("%-4s",String.valueOf(animal.getId())) + "|" + String.format("%-8s",animal.name));

                }

            }

            if (parsedNumber == 3){
                Scanner in2 = new Scanner(System.in);
                System.out.println("             Animal Farm");
                System.out.println("Welche Tierart wollen Sie anzeigen?");
                System.out.println(" ");
                System.out.println(String.format("%-5s","1.") + "Pferd");
                System.out.println(String.format("%-5s","2.") + "Kuh");
                System.out.println(String.format("%-5s","3.") + "Schwein");
                System.out.println(String.format("%-5s","4.") + "Huhn");
                String enteredNumber2 = in.next();
                int parsedNumber2 = Integer.parseInt(enteredNumber2);

                if (parsedNumber2 == 1){
                    int numbering = 0;
                    for (Animal animal : lifestock) {
                        if (animal instanceof Horse){
                            System.out.println(String.format("%-3s",String.valueOf(++numbering)) + "|" + String.format("%-4s",String.valueOf(animal.getId())) + "|" + String.format("%-8s",animal.name));
                        }
                    }
                }else if(parsedNumber2 == 2){
                    int numbering = 0;
                    for (Animal animal : lifestock) {
                        if (animal instanceof Cow){
                            System.out.println(String.format("%-3s",String.valueOf(++numbering)) + "|" + String.format("%-4s",String.valueOf(animal.getId())) + "|" + String.format("%-8s",animal.name));
                        }
                    }
                }else if(parsedNumber2 == 3){
                    int numbering = 0;
                    for (Animal animal : lifestock) {
                        if (animal instanceof Pig){
                            System.out.println(String.format("%-3s",String.valueOf(++numbering)) + "|" + String.format("%-4s",String.valueOf(animal.getId())) + "|" + String.format("%-8s",animal.name));
                        }
                    }
                }else if(parsedNumber2 == 4){
                    int numbering = 0;
                    for (Animal animal : lifestock) {
                        if (animal instanceof Chicken){
                            System.out.println(String.format("%-3s",String.valueOf(++numbering)) + "|" + String.format("%-4s",String.valueOf(animal.getId())) + "|" + String.format("%-8s",animal.name));
                        }
                    }
                }else{
                    System.out.println("Fehler bei der Eingabe");
                }
            }

            if (parsedNumber == 4){
                List<Integer> deleate = new ArrayList<>();
                Scanner in2 = new Scanner(System.in);
                System.out.println("             Animal Farm");
                System.out.println("Welche Tierart wollen Sie löschen?");
                System.out.println(" ");
                System.out.println(String.format("%-5s","1.") + "Pferd");
                System.out.println(String.format("%-5s","2.") + "Kuh");
                System.out.println(String.format("%-5s","3.") + "Schwein");
                System.out.println(String.format("%-5s","4.") + "Huhn");
                String enteredNumber2 = in.next();
                int parsedNumber2 = Integer.parseInt(enteredNumber2);

                if(parsedNumber2 == 1) {
                    int numbering = 0;
                    int numberingAll = 0;
                    for (Animal animal : lifestock) {
                        if (animal instanceof Horse) {
                            System.out.println(String.format("%-3s", String.valueOf(++numbering)) + "|" + String.format("%-4s", String.valueOf(animal.getId())) + "|" + String.format("%-8s", animal.name));
                            deleate.add(numberingAll);
                        }
                        numberingAll++;
                    }
                }else if(parsedNumber2 == 2) {
                    int numbering = 0;
                    int numberingAll = 0;
                    for (Animal animal : lifestock) {
                        if (animal instanceof Cow) {
                            System.out.println(String.format("%-3s", String.valueOf(++numbering)) + "|" + String.format("%-4s", String.valueOf(animal.getId())) + "|" + String.format("%-8s", animal.name));
                            deleate.add(numberingAll);
                        }
                        numberingAll++;
                    }
                }else if(parsedNumber2 == 3) {
                    int numbering = 0;
                    int numberingAll = 0;
                    for (Animal animal : lifestock) {
                        if (animal instanceof Pig) {
                            System.out.println(String.format("%-3s", String.valueOf(++numbering)) + "|" + String.format("%-4s", String.valueOf(animal.getId())) + "|" + String.format("%-8s", animal.name));
                            deleate.add(numberingAll);
                        }
                        numberingAll++;
                    }
                }else if(parsedNumber2 == 4) {
                    int numbering = 0;
                    int numberingAll = 0;
                    for (Animal animal : lifestock) {
                        if (animal instanceof Chicken) {
                            System.out.println(String.format("%-3s", String.valueOf(++numbering)) + "|" + String.format("%-4s", String.valueOf(animal.getId())) + "|" + String.format("%-8s", animal.name));
                            deleate.add(numberingAll);
                        }
                        numberingAll++;
                    }
                }
                Scanner remove = new Scanner(System.in);
                System.out.println("Welches Tier wollen Sie löschen (Nr. eingeben):");
                String enteredNumber3 = in.next();
                int parsedNumber3 = Integer.parseInt(enteredNumber3);
                int delete = deleate.get(--parsedNumber3);
                lifestock.remove(delete);
            }

            Scanner in2 = new Scanner(System.in);
            System.out.println("    Animal Farm");
            System.out.println("Was möchten Sie tun?");
            System.out.println(" ");
            System.out.println(String.format("%-5s","1.") + "Tier hinzufügen");
            System.out.println(String.format("%-5s","2.") + "Tiere anzeigen");
            System.out.println(String.format("%-5s","3.") + "Tiere nach Art anzeigen");
            System.out.println(String.format("%-5s","4.") + "Tier entfernen");
            System.out.println(String.format("%-5s","5.") + "Programm beenden");

            String enteredNumber2 = in.next();
            parsedNumber = Integer.parseInt(enteredNumber2);


        }


    }

}
