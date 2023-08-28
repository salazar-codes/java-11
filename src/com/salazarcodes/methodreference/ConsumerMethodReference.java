package com.salazarcodes.methodreference;

import com.salazarcodes.data.Student;
import com.salazarcodes.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    // static Consumer<Student> c1 = student -> System.out.println(student);
    /**
     * ClassName::MethodName
     */
    static Consumer<Student> c1 = System.out::println;
    /**
     * ClassName::instanceMethodName
     */
    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
