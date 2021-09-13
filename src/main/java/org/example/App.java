package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
    //p = principle, r = rate of interest, t = time/years, a = amount at end of investment
        System.out.println( "Enter the principle: " );
        double p = input.nextInt();

        System.out.println( "Enter the rate of interest: " );
        double r = input.nextDouble();
        r = r/100;

        System.out.println( "Enter the number of years: " );
        double t = input.nextInt();

        double a = p * (1 + (r*t));

        System.out.printf("After %.0f years at %.1f%%, the investment will be worth $%.2f.", t, r*100, a);
    }
}
