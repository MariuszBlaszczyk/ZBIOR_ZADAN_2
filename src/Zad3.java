
/*
Elementy pobranej od użytkownika tablicy typu double
zwiększ o średnią elementów z tablicy znajdujących się pod indeksami parzystymi.
 */

import java.util.Arrays;

public class Zad3 {

    static double average(double... numbers) {
        double sum = 0;
        for (double value : numbers) {
            sum += value;
        }
        return sum / numbers.length;
    }

    static double[] arrayIncrementedByTheAverageOfTheElementsFromEvenIndices(double[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array is null!!!");
        }
        double[] newArray = Arrays.copyOf(array, array.length);
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                avg = average(array[i]);
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] += avg;
        }
        return newArray;
    }

    public static void main(String[] args) {

        double[] array1 = {9, 2, 9, 4, 9, 6, 9, 8, 9, 10};
        double[] array2 = arrayIncrementedByTheAverageOfTheElementsFromEvenIndices(array1);
        System.out.println(Arrays.toString(array2));
    }
}


