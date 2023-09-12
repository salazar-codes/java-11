package com.salazarcodes.streams;

import com.salazarcodes.data.Student;
import com.salazarcodes.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> nameList() {
        List<String> studentList =  StudentDataBase.getAllStudents().stream() // Stream<Student>
                // Student as an input -> Student Name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase) // String<String> -> uppercase operation on each input
                .collect(Collectors.toList()); //List<String>

        return studentList;
    }

    public static Set<String> namesSet() {
        Set<String> studentList =  StudentDataBase.getAllStudents().stream() // Stream<Student>
                // Student as an input -> Student Name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase) // String<String> -> uppercase operation on each input
                .collect(Collectors.toSet()); //List<String>

        return studentList;
    }

    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(namesSet());
    }
}
