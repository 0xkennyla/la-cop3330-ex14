/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise14 {
    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the order amount?");
        double subtotal = scan.nextDouble();
        System.out.println("What is the state?");
        String state = scan.next();

        if (state.equals("WI"))
        {
            System.out.println("The subtotal is $" + subtotal + ".");
            double tax = subtotal * .055;
            System.out.println("The tax is $" + tax + ".");
            double total = subtotal + tax;
            System.out.println("The total is $" + total + ".");
        }
            System.out.println("The total is $"+subtotal+".");
    }
}