package com.project.poc_sequenced_collections.types;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class SetExample {

    public static void execute(){
        SequencedSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());
    }
}
