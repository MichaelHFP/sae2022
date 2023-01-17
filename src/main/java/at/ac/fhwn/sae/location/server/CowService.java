package at.ac.fhwn.sae.location.server;

import org.springframework.stereotype.Service;

import java.util.Hashtable;

@Service
public class CowService {

    Hashtable<Integer, Cow> cows = new Hashtable<>();


    public void helloWorld(Cow cow, int index){
        System.out.println("Hello World");
        cows.put(42, cow);
    }

    public Hashtable<Integer, Cow> getCows(){
        return cows;
    }



}


