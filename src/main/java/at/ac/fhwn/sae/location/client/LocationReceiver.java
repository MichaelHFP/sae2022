package at.ac.fhwn.sae.location.client;

import at.ac.fhwn.sae.lesson3.excercise3.*;
import at.ac.fhwn.sae.lesson4.SaePoint;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.*;

public class LocationReceiver {
    public static void main (String [] args) throws JsonProcessingException {
        LocationClientService locationClientService = new LocationClientService();
        Scanner in = new Scanner(System.in);
        System.out.println("Location Receiver");
        System.out.println("Was möchten Sie tun?");
        System.out.println(" ");
        System.out.println(String.format("%-5s", "1.") + "Letzte Position mit ID");
        System.out.println(String.format("%-5s", "2.") + "Positionen mit ID");
        System.out.println(String.format("%-5s", "3.") + "Alle Positionen");
        System.out.println(String.format("%-5s", "4.") + "Programm beenden");
        int parsedNumber = 0;

        while (parsedNumber < 4) {
            String enteredNumber = in.next();
            parsedNumber = Integer.parseInt(enteredNumber);
            if (parsedNumber == 1) {
                System.out.println("ID eingeben: ");
                SaePoint saePoint = locationClientService.getLocation(Integer.parseInt(in.next()));
                System.out.println(String.format("%9s | %9s | %9s | %9s | %4s", "time", "lat", "lon", "satNr.", "fix"));
                System.out.println(String.format("%9s | %9f | %9f | %9d | %4d", saePoint.getTime(), saePoint.getLatitude(), saePoint.getLongitude(), saePoint.getNumberOfSatelites(), saePoint.getFix()));
            } else if (parsedNumber == 2) {
                System.out.println("ID eingeben: ");
                List<SaePoint> listSaePoints = locationClientService.getLocations(Integer.parseInt(in.next()));
                System.out.println(String.format("%9s | %9s | %9s | %9s | %4s", "time", "lat", "lon", "satNr.", "fix"));
                for (SaePoint location : listSaePoints) {
                    System.out.println(String.format("%9s | %9f | %9f | %9d | %4d", location.getTime(), location.getLatitude(), location.getLongitude(), location.getNumberOfSatelites(), location.getFix()));
                }
            } else if (parsedNumber == 3) {
                Hashtable<Integer, List<SaePoint>> saePointHashtable = locationClientService.getAllLocations();
                System.out.println(String.format("%-4s | %9s | %9s | %9s | %9s | %4s", "id", "time", "lat", "lon", "satNr.", "fix"));
                for (Map.Entry<Integer, List<SaePoint>> entry : saePointHashtable.entrySet()) {
                    for (SaePoint location : saePointHashtable.get(entry.getKey())) {
                        System.out.println(String.format("%-4d | %9s | %9f | %9f | %9d | %4d", entry.getKey(), location.getTime(), location.getLatitude(), location.getLongitude(), location.getNumberOfSatelites(), location.getFix()));
                    }
                }
            }
            System.out.println("Was möchten Sie tun?");
            System.out.println(" ");
            System.out.println(String.format("%-5s", "1.") + "Letzte Position mit ID");
            System.out.println(String.format("%-5s", "2.") + "Positionen mit ID");
            System.out.println(String.format("%-5s", "3.") + "Alle Positionen");
            System.out.println(String.format("%-5s", "4.") + "Programm beenden");
        }
    }
}


