package com.perscholas.java_basics;

import java.util.Scanner;

public class Loops {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int operation;
        do {
            System.out.println("\n---------------------------------------------");
            System.out.println("1. Print numbers 1- 10 using for-loop");
            System.out.println("2. Print numbers 0-100 increments of 10 using while-loop");
            System.out.println("3. Print numbers 1- 10 using do-while-loop");
            System.out.println("4. Print multiples of 5 between 1-100 avoiding between 25-75");
            System.out.println("5. Print multiples of 5 between 1-100 avoiding greater than 50");
            System.out.println("6. Print days of week using nested for-loop");
            System.out.println("7. Print palindromes within 10 and 200");
            System.out.println("8. Prints the Fibonacci Sequence from 0 to 50");
            System.out.println("9. Nested for-loop");
            System.out.println("10. Exit");
            System.out.println("Please select one of the operation to perform : ");
            operation = input.nextInt();
            switch (operation) {
                case 1:
                    printNumUsingForLoop();
                    break;
                case 2:
                    printNumUsingWhileLoop();
                    break;
                case 3:
                    printNumUsingDoWhileLoop();
                    break;
                case 4:
                    printMultiplesOfFive();
                    break;
                case 5:
                    printMultiplesOfFiveTillFifty();
                    break;
                case 6:
                    printDaysAndWeek();
                    break;
                case 7:
                    printPalindromes();
                    break;
                case 8:
                    printFibonacci();
                    break;
                case 9:
                    nestedForLoop();
                    break;
                case 10:
                    break;
                default:
                    System.out.println("ERROR : Please select valid operation");
            }
        } while (operation != 10);
    }

    /*Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.*/
    private static void printNumUsingDoWhileLoop() {
        int i = 1;
        do {
            System.out.println(i);
            i += 1;
        } while (i <= 10);
    }

    /*Write a program that uses a for-loop to loop through the numbers 1-100.
    Print out each number if is a multiple of 5, but do not print out any numbers between 25 and 75.
    Use the “continue” statement to accomplish this.*/
    private static void printMultiplesOfFive() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                if (i >= 25 && i <= 75) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }

    /* Write a program that uses a for-loop to loop through the numbers 1-100.
       Print out each number if is a multiple of 5, but do not print out any numbers greater than 50.
       Use the “break” keyword to accomplish this.*/
    private static void printMultiplesOfFiveTillFifty() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                if (i > 50)
                    break;
                System.out.println(i);
            }
        }
    }

    /* Write a program that uses nested for-loops to output the following:
       Week 1:
       Day 1
       Day 2
       Day 3
       Day 4
       Day 5
       Week 2:
       Day 1
       Day 2
       Day 3
       Day 4
       Day 5 */
    private static void printDaysAndWeek() {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Week " + i + ":");
            for (int j = 1; j <= 5; j++) {
                System.out.println("Day " + j);
            }
        }
    }

    /* Write a program that returns all the available palindromes within 10 and 200.
      The following output will be produced:
      11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,*/
    private static void printPalindromes() {
        for (int num = 10; num <= 200; num++) {
            String strRevNum = "";
            String strNum = String.valueOf(num);
            int strLen = strNum.length();
            while (strLen != 0) {
                strLen--;
                strRevNum = strRevNum.concat(String.valueOf(strNum.charAt(strLen)));
                if (strNum.equals(strRevNum))
                    System.out.println(Integer.parseInt(strNum));
            }
        }
    }

    /* Write a program that prints the Fibonacci Sequence from 0 to 50.
    The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, */
    private static void printFibonacci() {
        System.out.println(0);
        System.out.println(1);
        for (int i = 0; i + (i + 1) <= 50; i++) {
            System.out.println(i + (i + 1));
        }
    }

    /* Write a program that nests a for-loop inside another.
    Print out the inner and outer variable (e.g., i or j) in the inner loop
    (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);). */
    private static void nestedForLoop() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Inner loop: i: " + i + ", j: " + j);
            }
        }
    }

    /*Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and prints out each number.*/
    private static void printNumUsingWhileLoop() {
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i += 10;
        }
    }

    /*Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.*/
    private static void printNumUsingForLoop() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

}