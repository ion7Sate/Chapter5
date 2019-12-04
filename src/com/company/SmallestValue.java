package com.company;
import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {

        int n;
        int number;
        int smallest=0;
        int i=0;

        Scanner input = new Scanner(System.in);

        System.out.println("How many values do you want to enter: ");
        n = input.nextInt();

        for(i=0;i<n;i++){

            System.out.println("Enter your number: ");
            number = input.nextInt();

            if(i==0){
                smallest = number;
            }

            if(number<smallest){
                smallest=number;

            }

        }

        System.out.println("Smallest value is: "+smallest);

    }
}
