package com.salazarcodes.funcionalinterfaces;

import com.salazarcodes.data.Student;
import com.salazarcodes.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name+" : "+activities);
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach((student) -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b) -> {
            System.out.println("a: "+ a + ", b: " + b);
        };
        biConsumer.accept("Java-8","Java-11");

        BiConsumer<Integer,Integer> multiply = (a,b) -> System.out.println("Multiplication is: " + (a * b));
        BiConsumer<Integer,Integer> division = (a,b) -> System.out.println("Division is: " + (a / b));

        multiply.andThen(division).accept(10,5);

        nameAndActivities();
    }
}
