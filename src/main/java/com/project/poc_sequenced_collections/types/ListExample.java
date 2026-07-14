package com.project.poc_sequenced_collections.types;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class ListExample {

    public static void execute() {

        SequencedCollection<String> names = new ArrayList<>();

        names.add("Joao");
        names.add("Maria");
        names.add("Pedro");

        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        names.addFirst("Carlos");
        names.addLast("Jose");

        System.out.println(names);

        names.removeFirst();
        names.removeLast();

        System.out.println(names);
    }

}