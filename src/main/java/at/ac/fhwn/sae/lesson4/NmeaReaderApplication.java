package at.ac.fhwn.sae.lesson4;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NmeaReaderApplication {

    private Scanner scanner;
    private final File file;

    public static void main(String[] args) throws FileNotFoundException {
        List<SaePoint> gnggaData = new ArrayList<>();
        Scanner scanner = fileReader();
        saePointMaker(gnggaData, scanner);
        printCoordinates(gnggaData);

    }

    public NmeaReaderApplication(File nmeaFile){
        try {
            file = nmeaFile;
            assert nmeaFile.exists();
            FileInputStream fis = new FileInputStream(nmeaFile);
            scanner = new Scanner(fis);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public SaePoint readPoint() {
        while (scanner.hasNext()){
            String[] components = scanner.nextLine().split(",");

            if (components[0].equals("$GNGGA")){
                return new SaePoint(components);
            }
        }
        if(scanner.hasNext()){
            try {
                assert file.exists();
                FileInputStream fis = new FileInputStream(file);
                scanner = new Scanner(fis);
            } catch (IOException e){
                throw new RuntimeException(e);
            }
            return this.readPoint();
        }
        return null;
    }

    private static Scanner fileReader() throws FileNotFoundException {
        File file = new File(NmeaReaderApplication.class.getClassLoader().getResource("auto.txt").getFile());
        System.out.println("Exists: " + file.exists());
        System.out.println("Can read: " + file.canRead());

        FileInputStream fis = new FileInputStream(file);
        return new Scanner(fis);
    }

    private static void saePointMaker(List<SaePoint> gnggadata, Scanner scanner) {
        while (scanner.hasNext()){
            String[] components = scanner.nextLine().split(",");
            if(components[0].equals("$GNGGA")){
                gnggadata.add(new SaePoint(components));
            }
        }
    }


    public static void printCoordinates(List<SaePoint> saePoints){
        System.out.println(String.format("%9s | %9s | %9s | %9s | %4s", "time","lat","lon","satNr.","fix"));
        for(SaePoint location:saePoints){
            System.out.println(String.format("%9s | %9f | %9f | %9f | %4f", location.getTime(), location.getLatitude(), location.getLongitude(), location.getNumberOfSatelites(), location.getFix()));
        }

    }
}