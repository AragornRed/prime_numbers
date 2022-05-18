package primeNumbers;

/**
 * Created by aragorn_red (Rafał Szmatuła) on 18.05.2022
 */
public class Result {
    int number;
    Result(int number) {
        this.number = number;
    } // constructor

    public int isPrime(int number) { // function which checks if number indicated by user is prime or not
        this.number = number;
        if (number == 1) return 0; // in matter of fact 1 is neither prime nor composite number
        else if (number == 2) return 1;
        else if (number > 2) {
            for (int i = 2; i < number; i++) if (number % i == 0) return 0;
        }
        return 1;
    }

    public void resultPrinter(int n, int number) {
        this.number = number;
        if (n == 0) System.out.println(number + " - NO");
        else if (n == 1) System.out.println(number + " - YES");
    }
}
