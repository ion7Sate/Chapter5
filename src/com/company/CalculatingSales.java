package com.company;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int productNumber;
        int qunatitySold;
        float totalRetail = 0;

        while(true){
            System.out.println("1-Product 1,price:2.98$");
            System.out.println("2-Product 2,price:4.50$");
            System.out.println("3-Product 3,price:9.98$");
            System.out.println("4-Product 4,price:4.49$");
            System.out.println("5-Product 5,price:6.87$");
            System.out.println("Enter another number to exit ");

            productNumber = input.nextInt();

            if(productNumber<1||productNumber>5){
                break;
            }

            System.out.println("Enter quantity sold: ");
            qunatitySold = input.nextInt();

            switch (productNumber){

                case 1:
                    totalRetail += qunatitySold * 2.98f;
                    break;

                case 2:
                    totalRetail += qunatitySold * 4.50f;
                    break;

                case 3:
                    totalRetail += qunatitySold * 9.98f;
                    break;

                case 4:
                    totalRetail += qunatitySold * 4.49;
                      break;

                case 5:
                    totalRetail += qunatitySold * 6.87f;
                    break;

            }

        }
        System.out.println("The total retail value of all products sold :"+totalRetail+"$");
    }
}
