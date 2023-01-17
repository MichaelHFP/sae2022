package at.ac.fhwn.sae.lesson3.excercise3;

public class Pig extends Animal{

    private static final String DEFAULT_PIG_NAME = "default pig name";

    private static int count = 0;
    private String id;

    public Pig(){
        this.name = DEFAULT_PIG_NAME;
        if (count < 10){
            this.id = "S00" + ++count;
        }else if(count < 100){
            this.id = "S0" + ++count;
        }else {
            this.id = "S" + ++count;
        }
    }

    public Pig(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }


}
