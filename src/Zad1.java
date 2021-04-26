
/*
Do tablicy jednowymiarowej każdy kolejny element losuj z przedziału <4,10> dopóki suma aktualnie
losowanej wartości i wszystkich poprzednich elementów tablicy nie będzie liczbą pierwszą.
Wypisz tablicę na ekranie.
 */

import java.util.Arrays;
import java.util.Random;

public class Zad1 {

    static int generateNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Random range is not correct");
        }
        return new Random().nextInt(max - min + 1) + min;
    }

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

    static void generateAndShowArray(int sizeMin, int sizeMax, int valueMin, int valueMax) {
        int size = generateNumber(sizeMin, sizeMax);
        int[] array = new int[size];
        System.out.println("Array size is: " + size);
        do {
            array[0] = generateNumber(valueMin, valueMax);
        } while (isPrime(array[0]));
        do {
            array[1] = generateNumber(valueMin, valueMax);
        } while (isPrime(array[0] + array[1]));
        for (int i = 2; i < array.length; i++) {
            if (!isPrime(array[i] + array[i - 1])) {
                array[i] = generateNumber(valueMin, valueMax);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        int min = 4;
        int max = 10;

        generateAndShowArray(min, max, min, max);
    }
}
