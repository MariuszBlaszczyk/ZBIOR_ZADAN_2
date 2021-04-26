import java.util.Scanner;

public class Zad5 {

    /*
    Pobieraj od użytkownika współrzędne trzech punktów dopóki
    nie będą one współliniowe, czyli nie będą leżały na jednej prostej.
     */

    static int getNumberFromUser(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
