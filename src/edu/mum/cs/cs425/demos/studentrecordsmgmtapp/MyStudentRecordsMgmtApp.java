package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.util.Date;
import java.util.stream.Stream;

public class MyStudentRecordsMgmtApp {

    public static void main(String[] args){
        Student[] students = new Student[]{
                new Student(110001, "Dave", 1951, 11, 18),
                new Student(110002, "Anna", 1990, 12, 7),
                new Student(110003, "Erica", 1974, 1, 13),
                new Student(110004, "Carlos", 2009, 8, 22),
                new Student(110005, "Bob", 1990, 3, 5)
        };

        printListOfStudents(students);

        System.out.println("-------------- Platinum Alumni Students ---------------------");

        Stream.of(getListOfPlatinumAlumniStudents(students))
                .sorted((Student s1, Student s2) -> s2.getDateOfAdmission().compareTo(s1.getDateOfAdmission()))
                .forEach(s -> System.out.println(s + ","));

    }


    private static void printListOfStudents(Student[] students){
        Stream.of(students)
            .sorted((Student s1, Student s2) -> s1.getName().compareToIgnoreCase(s2.getName()))
            .forEach(s -> System.out.println(s + ","));
    }

    private static Student[] getListOfPlatinumAlumniStudents(Student[] students){
        final int PLATINUM_YEAR = 30;

        return Stream.of(students)
                .filter((s) -> new Date().getYear() - s.getDateOfAdmission().getYear() >= PLATINUM_YEAR)
                .toArray(Student[]::new);
    }
}
