package com.project.poc_sequenced_collections.types;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class ReversedExample {

    public static void execute(){
        SequencedCollection<String> cities = new ArrayList<>();

        cities.add("Paris");
        cities.add("Roma");
        cities.add("Londres");
        cities.add("Viena");

        cities.reversed().forEach(System.out::println);
    }

}
