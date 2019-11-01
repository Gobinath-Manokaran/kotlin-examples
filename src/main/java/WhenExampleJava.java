package main.java;

public class WhenExampleJava {

    public static void main(String[] args) {
        int day =2;
        String dayString= new String();
        switch (day){
            case 1:
                System.out.println("Monday");
                dayString="Monday";
                break;
            case 2:
                System.out.println("Tuesday");
                dayString="Tuesday";
                break;
            case 3:
                System.out.println("Wednesday");
                dayString="Wednesday";
                break;
            case 4:
                System.out.println("Thursday");
                dayString="Thursday";
                break;
            case 5:
                System.out.println("Friday");
                dayString="Friday";
                break;
            case 6:
                System.out.println("Saturday");
                dayString="Saturday";
                break;
            case 7:
                System.out.println("Sunday");
                dayString="Sunday";
                break;
            default:
                System.out.println("Not a weekday");
        }
        System.out.println("Given day is for " + day + " is " + dayString);
    }
}

