package com.salazarcodes.funcionalinterfaces;

import com.salazarcodes.data.Student;
import com.salazarcodes.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExampleTwo {
    private static Consumer<Student> c1 = (student) -> System.out.println(student);
    private static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
    private static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());

    public static void printStudents(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1);
    }

    public static void printNameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2.andThen(c3));
    }

    public static void printNameAndActivitiesUsingCondition(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9){
                c2.andThen(c3).accept(student);
            }
        }));
    }

    public static void main(String[] args) {
        //printStudents();
        //printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
