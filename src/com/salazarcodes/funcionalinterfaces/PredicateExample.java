package com.salazarcodes.funcionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    // public static Predicate<Integer> predicate = (number) -> { return number % 2 == 0; };
    public static Predicate<Integer> predicate1 = (number) -> number % 2 == 0; // single line
    public static Predicate<Integer> predicate2 = (number) -> number % 5 == 0;

    public static void predicateAnd() {
        System.out.println("Predicate And result is:" + predicate1.and(predicate2).test(9));
        System.out.println("Predicate And result is:" + predicate1.and(predicate2).test(10));
    }

    public static void predicateOr() {
        System.out.println("Predicate Or result is:" + predicate1.or(predicate2).test(10));
        System.out.println("Predicate Or result is:" + predicate1.or(predicate2).test(8));
    }

    public static void predicateNegate() {
        System.out.println("Predicate Negate result is:" + predicate1.or(predicate2).negate().test(10));
    }

    public static void main(String[] args) {
        System.out.println(predicate1.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
