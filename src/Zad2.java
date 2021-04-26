
/*
Pobieraj od użytkownika trzy liczby,
dopóki suma cyfr dwóch pierwszych liczb nie będzie liczbą pierwszą większą od liczby trzeciej.
 */

import java.util.Scanner;

public class Zad2 {

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        double sqrt = Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int getNumberFromUser() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    static int sumDigits(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int numberSum = sumDigits(number1 + number2);


        do {
            System.out.println("Give the first number:");
            number1 = getNumberFromUser();
            System.out.println("Give the second number:");
            number2 = getNumberFromUser();
            numberSum = sumDigits(number1 + number2);
        } while (!isPrime(numberSum));

        do {
            System.out.println("Give the third number:");
            number3 = getNumberFromUser();
        } while (!(numberSum > number3));

    }
}
