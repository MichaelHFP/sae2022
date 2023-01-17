package at.ac.fhwn.sae.location.client;

import at.ac.fhwn.sae.lesson4.NmeaReaderApplication;
import at.ac.fhwn.sae.lesson4.SaePoint;

import java.io.File;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class LocationTransmitter {

    public static void main(String[] args) {
        File file = new File(NmeaReaderApplication.class.getClassLoader().getResource("auto2.txt").getFile());

        NmeaReaderApplication nmeaReader = new NmeaReaderApplication(file);
        LocationClientService locationClientService = new LocationClientService();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                SaePoint saePoint = nmeaReader.readPoint();
                locationClientService.sendLocation(2, saePoint);
                System.out.println("Time:" + new Date());
            }
        };

        Timer timer = new Timer("timerTask");
        timer.scheduleAtFixedRate(timerTask, 1000, 1000);


    }
}


