package com.salazarcodes.funcionalinterfaces;

import com.salazarcodes.data.Student;
import com.salazarcodes.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel() {
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {
            if(p.or(p2).test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
    }
}
