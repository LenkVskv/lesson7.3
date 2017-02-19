package Lesson7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olenkaa on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Names names = new Names();
        names.add("Andrew");
        names.add("Olga");
        names.add("Stephan");
        names.add("Bogdan");
        names.add("Maks");
        names.add("Yana");
        names.add("Tony");

        names.sortAlphabetically();
        names.print();
        names.sortAlphabeticallyBackwards();
        names.print();
        names.sortByNumberOfLetters();
        names.print();
        names.sortTheSameNumberOfLetters();
        names.print();
        names.findMin();
        names.print();


    }
}
