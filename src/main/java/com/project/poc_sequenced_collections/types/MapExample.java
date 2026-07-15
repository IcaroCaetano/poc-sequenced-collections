package com.project.poc_sequenced_collections.types;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class MapExample {
    public static void execute(){
        SequencedMap<Integer,String> employees = new LinkedHashMap<>();

        employees.put(1,"Ana");
        employees.put(2,"Carlos");
        employees.put(3,"Pedro");
        employees.put(4,"Maria");

        System.out.println(employees.firstEntry());
        System.out.println(employees.lastEntry());
    }

}
