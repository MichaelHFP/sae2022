package at.ac.fhwn.sae.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Inheritence {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Dog Hundi = new Dog();
        System.out.println(dog.getName());
        System.out.println(Dog.getCount() + " dogs created");
        dog.bark();
//        createDog();

        Cat cat = new Cat();
        System.out.println(cat.getName());

        List<Animal> list = new ArrayList();
        list.add(dog);
        list.add(cat);
        list.add(Hundi);


            /*for (int i =0; i<list.size(); i++){
                System.out.println(list.get(i).name);
            }Normale Schleife , nächste Schleife ist for each Schleife ... für alle in einer Collection*/
        for (Animal animal : list) {
            System.out.println(animal.name);
            if (animal instanceof Dog){
                ((Dog) animal).bark();
            }
        }

        /*static void createDog(){
        }*/
    }
}
