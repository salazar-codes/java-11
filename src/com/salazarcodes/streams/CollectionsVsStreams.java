package com.salazarcodes.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {
    public static void main(String[] args) {

        // Collections can be added and modified
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("robert");

        // Collections can be traversed anytime
        for (String name : names){
            System.out.println(name);
        }
        for (String name : names){
            System.out.println(name);
        }

        // Collections can be access at any point
        names.remove(0);
        System.out.println(names);

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        // nameStream.forEach(System.out::println); Exception in thread "main" stream has already been operated upon or closed
    }
}
