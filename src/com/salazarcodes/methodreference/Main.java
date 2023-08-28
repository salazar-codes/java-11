package com.salazarcodes.methodreference;

import java.util.function.Function;

public class Main {

    static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
    static Function<String, String> toUpperMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("Java 11"));
        System.out.println(toUpperMethodReference.apply("Java 14"));
    }
}
