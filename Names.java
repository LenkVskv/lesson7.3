package Lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Olenkaa on 18.02.2017.
 */
public class Names {
    private List<String> names = new ArrayList<>();

    public Names() {
    }

    public Names(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }

    public void add(String s){
        names.add(s);
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
    public void sortAlphabetically(){
        Collections.sort(names,(a,b) -> a.compareTo(b));
    }
    public void sortAlphabeticallyBackwards(){
        Collections.sort(names,(a,b)-> -a.compareTo(b));
    }
    public void findMin(){
        System.out.println(Collections.min(names));
    }
    public void sortByNumberOfLetters(){
        Collections.sort(names,(a,b)-> {
            if(a.length()>b.length())
                return 1;
            if(a.length()<b.length())
                return -1;
            return  0;
        });
    }
    public void sortTheSameNumberOfLetters(){
        Collections.sort(names,(a,b)-> {
            if(a.length()>b.length())
                return 1;
            if(a.length()<b.length())
                return -1;
            return  a.compareTo(b);
        });
    }
    public void print(){
        for(String s: names) {
            System.out.println(s);
        }
        System.out.println();
    }
    @Override
    public String toString() {

        return "Names{" +
                "names=" + names +
                '}';

    }
}

