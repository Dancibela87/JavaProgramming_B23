package methods;

import java.util.Scanner;

public class TimeConvertor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());

    }

    public static void timeConversion(String s) {
        String amPm = s.toUpperCase().substring(s.length() - 2);
        String hours = s.substring(0, s.indexOf(":"));

        if (amPm.equals("AM")) {
            if (hours.equals("12")) {
                System.out.println("00:00:00");
            } else {
                System.out.println(s.substring(0, s.indexOf("A")));
            }
        }
            if (amPm.equals("PM")) {

                switch (hours) {
                    case "01":
                        hours = "13";
                        break;
                    case "2":
                        hours = "14";
                        break;
                    case "03":
                        hours = "15";
                        break;
                    case "04":
                        hours = "16";
                        break;
                    case "05":
                        hours = "17";
                        break;
                    case "06":
                        hours = "18";
                        break;
                    case "07":
                        hours ="19";
                        break;
                    case "08":
                        hours = "20";
                        break;
                    case "09":
                        hours = "21";
                        break;
                    case "10":
                        hours = "22";
                        break;

                }
                System.out.println(hours + s.substring(s.indexOf(":"), s.indexOf("PM")));
            }
              if(s.equals("12:00:00PM ")){
                  System.out.println(hours+s.substring(s.indexOf(":"), s.indexOf("PM")));
              }


        }
    }




/*
Given a time in 12 hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

The timeConversion method should convert and print the given number (String argument)
 */