package day13_ScannerContinued;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter current speed:");

        /*
        int currentSpeed= new Scanner(System.in).nextInt();
        you can use this just if you gonna use it once
         */

        int currentSpeed = input.nextInt();
        int speedLimit =90;
        int difference= currentSpeed-speedLimit;

        if(currentSpeed>speedLimit){//difference>0
            System.out.println("Slow down, you are going "+ difference+" over the limit");
        }


    }}
/*
 Write a program for the speed check.
 a variable named speedLimit is given and assigned,
 ask user to enter the current speed,
  if the current speed is over the speedLimit print slow down,
   otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!

            Enter current speed:
            45

            output:
 */