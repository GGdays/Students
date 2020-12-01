package com.example.students;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupNumber;

    public Student(String name,  String groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    private final static ArrayList<Student> students = new ArrayList<Student>(
            Arrays.asList(
                    new Student("Bondarenko S.","571"),
                    new Student("Vasev  M.","302"),
                    new Student("Garmash S.","301"),
                    new Student("Vorontsova N.","309"),
                    new Student("Gagin D.","303"),
                    new Student("Shpilevoi V.","303"),
                    new Student("Sidenko D.","303"),
                    new Student("Vovchenko D.","301"),
                    new Student("Passhalka P.","308"),
                    new Student("Bonia V.","301"),
                    new Student("Eliseev N.","302"),
                    new Student("Lukina A.","302"),
                    new Student("Duzev R.","303"),
                    new Student("Granchenko O.","302"),
                    new Student("Durnev O.","301"),
                    new Student("Kalashnikov E.","308"),
                    new Student("Andreichenko S.","308"),
                    new Student("Groza H.","309"),
                    new Student("Kovalenko V.",""),
                    new Student("Faleev K." , "571"),
                    new Student("Andreev L.","571"),
                    new Student("Kiashko M.","309"),
                    new Student("Voron Y.","309"),
                    new Student("Granch S.","571"),
                    new Student("Bondarenko A.","308"),
                    new Student("Stepanova I.","301"),
                    new Student("Harin T.","302")
            )
    );
    public static ArrayList<Student> getStudents(String groupNumber){
        ArrayList<Student> stList = new ArrayList<>();
        for (Student s: students) {
            if (s.getGroupNumber().equals(groupNumber)){
                stList.add(s);
            }
        }
        return stList;
    }
}
