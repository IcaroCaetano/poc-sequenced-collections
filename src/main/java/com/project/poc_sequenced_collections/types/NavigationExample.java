package com.project.poc_sequenced_collections.types;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class NavigationExample {

    public static void execute() {
        SequencedMap<Integer,String> map = new LinkedHashMap<>();

        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");

        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());

        System.out.println(map);
    }
}
