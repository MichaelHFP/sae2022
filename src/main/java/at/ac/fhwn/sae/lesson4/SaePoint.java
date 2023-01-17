package at.ac.fhwn.sae.lesson4;



public class SaePoint {
    private String time;
    private double numberOfSatelites;
    private double fix;
    private double latitude;
    private double longitude;

    public SaePoint(){}


    public SaePoint(String[] inputString){
        fix = Double.parseDouble(inputString[6]);
        numberOfSatelites = Double.parseDouble(inputString[7]);
        time = inputString[1];

        if (inputString[3].equals("N")){
            latitude = Double.parseDouble(inputString[2].substring(0,2));
            latitude = latitude + Double.parseDouble(inputString[2].substring(2))/60;
        } else if(inputString[3].equals("E")){
            latitude = Double.parseDouble(inputString[2].substring(0,2));
            latitude = latitude + Double.parseDouble(inputString[2].substring(2))/60;
            latitude = latitude * (-1);
        }
        if (inputString[5].equals("E")){
            longitude = Double.parseDouble(inputString[4].substring(0,3));
            longitude = longitude + Double.parseDouble(inputString[4].substring(3))/60;
        } else if(inputString[5].equals("W")){
            longitude = Double.parseDouble(inputString[4].substring(0,3));
            longitude = longitude + Double.parseDouble(inputString[4].substring(3))/60;
            longitude = longitude * (-1);
        }

    }

    public SaePoint(int id, double lat, double lon, String time, int satNr, int fixQ) {
        this.latitude = lat;
        this.longitude = lon;
        this.time= time;
        this.numberOfSatelites = satNr;
        this.fix = fixQ;

    }


    public int getNumberOfSatelites() {
        return (int) numberOfSatelites;
    }
    public int getFix() {
        return (int) fix;
    }
    public double getLongitude() {
        return longitude;
    }
    public double getLatitude() {
        return latitude;
    }
    public String getTime() {
        return time;
    }

}
