package com.company;
import  java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        System.out.println("Enter a number between 1 and 30 :");
        number1 = input.nextInt();

        System.out.println("Enter a number between 1 and 30 :");
        number2 = input.nextInt();

        System.out.println("Enter a number between 1 and 30 :");
        number3 = input.nextInt();

        System.out.println("Enter a number between 1 and 30 :");
        number4 = input.nextInt();

        System.out.println("Enter a number between 1 and 30 :");
        number5 = input.nextInt();

        for(int i=0;i<number1;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<number2;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<number3;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<number4;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<number5;i++){
            System.out.print("*");
        }

    }
}
