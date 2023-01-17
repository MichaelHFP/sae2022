package at.ac.fhwn.sae.lesson3.excercise3;

public class Horse extends Animal{

    private static final String DEFAULT_HORSE_NAME = "default horse name";

    private static int count = 0;
    private String id;

    public Horse(){
        this.name = DEFAULT_HORSE_NAME;
        if (count < 10){
            this.id = "P00" + ++count;
        }else if(count < 100){
            this.id = "P0" + ++count;
        }else {
            this.id = "P" + ++count;
        }
    }

    public Horse(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }


}
