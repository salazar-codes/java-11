package com.salazarcodes.methodreference;

import com.salazarcodes.data.Student;
import com.salazarcodes.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    //static Predicate<Student> p = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> p = RefactorMethodReferenceExample::greaterThaGradeLevel;

    public static boolean greaterThaGradeLevel(Student s){
        return s.getGradeLevel()>=3;
    }

    public static void main(String[] args) {
        System.out.println(p.test(StudentDataBase.studentSupplier.get()));
    }
}
