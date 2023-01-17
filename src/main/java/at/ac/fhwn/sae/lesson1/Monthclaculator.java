package at.ac.fhwn.sae.lesson1;

public class Monthclaculator {

    public static void main(String [] args){

        String monthString;

/*        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number for the Name of the month: ");
        String enteredMonth = in.next();
        int month = Integer.parseInt(enteredMonth);

        for(int i=13; month<=13; month++) {


            monthString = switch (month) {
                case 1 -> "January";
                case 2 -> "February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11 -> "November";
                case 12 -> "December";
                default -> "End of the year!";
            };
            System.out.println(monthString);

            if (month<13){
                System.out.println("The next month is called:");
            }
        }*/


       /* int i = 0;

        while (i<10){
            System.out.println(i);
            i++;
        }

        do{
            System.out.println(i);
        }while(i<10);*/

        /*int resultedNumber = add(3,4);
        System.out.println(resultedNumber);

        System.out.println(add("1",2,3));*/


        /*int[] intArray = new int[10];

        System.out.println(intArray[0]);
        intArray[0] = 42;
        System.out.println(intArray[0]);*/

        /*System.out.println("foreach");

        for(int value : intArray){
            System.out.println(value);
        }*/
        int value = 1024;
        System.out.println(getMaxOfBits(value));

    }

    public static int add(int number1, int number2){
        return number1 + number2;
    }

    public static int add(String number1, int number2, int number3){
        return add(add(Integer.parseInt(number1),number2), number3);
    }

    public static long getMaxOfBitsOther(int numberOfBits){
        return getMaxOfBitsOther(1,numberOfBits);
    }

    private static long getMaxOfBitsOther(long number, int numberOfBitsLeft){
        if(numberOfBitsLeft > 0){
            return getMaxOfBitsOther(number*2, --numberOfBitsLeft);
        }
        return number;
    }

    /**
     * Gets the maximum Number of a datatype with
     * @param numberOfBits blablabla
     * @return blablabla
     */
    public static long getMaxOfBits(int numberOfBits){
        long result = 1;
        while(numberOfBits>0){
            result*=2; numberOfBits--;
        }
        return result;
    }




}
