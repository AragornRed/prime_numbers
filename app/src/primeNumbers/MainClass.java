package primeNumbers;

import java.util.Scanner;

/**
 * Created by aragorn_red (Rafał Szmatuła) on 17.05.2022
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int m = 1;
        int number;
        while (m < 100000) { // number of loops
            System.out.println("Witaj, wprowadź liczbę naturalną od 1 do 10000, a ja powiem Ci, czy liczba jest " +
                    "pierwsza czy nie");
            number = inputData.nextInt();
            while (number <= 0 || number > 10000) {
                System.out.println("Błąd, liczba musi znajdować się w przedziale od 1 do 10000, spóbuj ponownie ");
                number = inputData.nextInt();
            }
            m++;
        }
    }
}
