package at.ac.fhwn.sae.lesson3.excercise3;

public abstract class Animal {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getId();


}
