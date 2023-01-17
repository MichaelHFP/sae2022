package at.ac.fhwn.sae.lesson3;

public class Dog extends Animal {
    private static final String CLASS_DESCRIPTION= "This is a dog class.";
    private String DEFAULT_DOG_NAME = "default dog name";

    private static int count = 0;
    private String id;
    /**
     * Parameterless Ctor for dog
     * Default name is Hundi
     */
    public Dog(){
        this.name = DEFAULT_DOG_NAME;
        this.id = "D" + ++count;
    }

    public Dog(String name){
        this.name = name;
        this.id = "D" + getCount();
    }

    public void bark(){
        System.out.println("Wuff");
    }


    @Override
    public String getID() {
        return Animal.DEFAULT_ID;
    }

    /**
     * Returns the Number of Dogs
     * @return
     */
    public static int getCount(){
        return count;
    }

    static Person buildperson(int number, String name){
        Person person = new Person(number, name);
        return null;
    }
}
