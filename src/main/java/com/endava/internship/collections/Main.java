package com.endava.internship.collections;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentSet students = new StudentSet();
        students.add(new Student("Beth", LocalDate.parse("2019-04-05"), "Computer Science"));
        students.add(new Student("Elena", LocalDate.parse("2019-04-09"), "Computer Science"));
        students.add(new Student("Anna", LocalDate.parse("2020-04-09"), "Computer Science"));
        students.add(new Student("Cristina", LocalDate.parse("2011-04-09"), "Computer Science"));
        students.add(new Student("Albert", LocalDate.parse("2011-04-09"), "Computer Science"));

        List<Student> studentList = students.sort();
        System.out.println(studentList);
    }
}