package primeNumbers;

import java.util.Scanner;

/**
 * Created by aragorn_red (Rafał Szmatuła) on 17.05.2022
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int m = 1; // auxiliary variable
        int number; // variable which will be checked for being prime number or not

        while (m < 100000) { // number of loops
            System.out.println("Hi there! Please indicate natural number in range from 1 to 10000, and I will tell " +
                    "you if this number is prime or not");
            number = inputData.nextInt();
            while (number <= 0 || number > 10000) { // loop which controls if number indicated by user is still within range
                System.out.println("Error!! Number must be in range from 1 to 10000, please try again");
                number = inputData.nextInt();
            }
            m++;
            Result result = new Result(number); // object from Class Result, needed for printing the result in terminal
            result.resultPrinter(result.isPrime(number), number);
        }
    }
}
