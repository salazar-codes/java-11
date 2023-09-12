package com.salazarcodes.lambda;

import java.util.function.Consumer;

public class LambdaVariable1 {
    public static void main(String[] args) {
        int i = 0;

        // Restriction 1 - Scope hierarchy
        Consumer<Integer> c1 = (i1) -> {
            System.out.println("Value is: " + i);
        };
    }
}
