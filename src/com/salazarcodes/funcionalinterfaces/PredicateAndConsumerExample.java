package com.salazarcodes.funcionalinterfaces;

import com.salazarcodes.data.Student;
import com.salazarcodes.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate<Student> studentGradePredicate = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> studentGpaPredicate = (student) -> student.getGpa() >= 3.9;
    static BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    static BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    static Consumer<Student> studentConsumer = (student) -> {
        //if(studentGradePredicate.and(studentGpaPredicate).test(student)){
        if( biPredicate.test(student.getGradeLevel(),student.getGpa()) ){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public static void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        printNameAndActivities(studentList);
    }
}
