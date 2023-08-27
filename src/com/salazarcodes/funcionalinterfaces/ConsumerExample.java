package com.salazarcodes.funcionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java8");

        List<String> platos = Arrays.asList("Juan", "María", "Carlos");
        Consumer<String> imprimirNombre = nombre -> System.out.println(nombre);

        platos.forEach(imprimirNombre);
        imprimirNombre.accept("java11");
    }
}
