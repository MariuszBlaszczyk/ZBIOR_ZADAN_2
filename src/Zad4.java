import java.util.Arrays;
import java.util.Random;

public class Zad4 {

    /*
    Do tablicy jednowymiarowej liczb całkowitych wylosuj elementy z przedziału <5, 20>.
    Następnie zaimplementuj nową tablicę, w której każdy kolejny element na pozycji i
    począwszy od i = 1 jest elementem, którego wartość to suma cyfr elementów
    pierwszej tablicy z pozycji od 0 do i-1. Pierwszy element nowej tablicy ma wartość 0.
    Wypisz w konsoli dwie otrzymane tablice.
     */


    static int generateNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Random range is not correct");
        }
        return new Random().nextInt(max - min + 1) + min;
    }


    static int[] generateArray(int size, int min, int max) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be grater then null");
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateNumber(min, max);
        }
        return array;
    }

    static int[] generateNewArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array is null");
        }
        int[] newArray = new int[array.length];
        newArray[0] = 0;
        int sum = array[0];
        for (int i = 1; i < newArray.length; i++) {
            sum += array[i];
            newArray[i] = sum;
        }
        return newArray;
    }


    public static void main(String[] args) {

        int size = 11;
        int min = 5;
        int max = 20;

        int[] array1 = generateArray(size, min, max);
        System.out.println("Array1 : " + Arrays.toString(array1) + "\n");

        int[] array2 = generateNewArray(array1);
        System.out.println("Array2: " + Arrays.toString(array2));


    }
}
