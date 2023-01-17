package at.ac.fhwn.sae.lesson3.excercise3;

import at.ac.fhwn.sae.lesson3.Person;

public class Chicken extends Animal{

    private static final String DEFAULT_CHICKEN_NAME = "default chicken name";

    private static int count = 0;
    private String id;

    public Chicken(){
        this.name = DEFAULT_CHICKEN_NAME;
        if (count < 10){
            this.id = "H00" + ++count;
        }else if(count < 100){
            this.id = "H0" + ++count;
        }else {
            this.id = "H" + ++count;
        }
    }

    public Chicken(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

}
