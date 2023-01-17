package at.ac.fhwn.sae.lesson3.excercise3;

public class Cow extends Animal{

    private static final String DEFAULT_COW_NAME = "default cow name";

    private static int count = 0;
    private String id;

    public Cow(){
        this.name = DEFAULT_COW_NAME;
        if (count < 10){
            this.id = "K00" + ++count;
        }else if(count < 100){
            this.id = "K0" + ++count;
        }else {
            this.id = "K" + ++count;
        }
    }

    public Cow(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

}


