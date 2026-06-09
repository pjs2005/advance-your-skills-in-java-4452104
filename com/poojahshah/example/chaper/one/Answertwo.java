package com.poojahshah.example.chaper.one;

import java.util.Arrays;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Write your answer here, and then test your code.
// Your job is to implement the findAnswer() method.

class Answertwo {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Return the highest grade for the students with a specific major
    static int findAnswer(List<StudentEntity> students, String major) {
        // Your code goes here.
        return students.stream()
                .filter(student -> student.getMajor().equals(major))
                .flatMap(s -> s.getGrades().values().stream())
                .sorted()
                .max(Integer::compareTo).orElseGet(() -> 0);
    }

    public static void main(String[] args) {
        List<StudentEntity> students = Arrays.asList(
                new StudentEntity("Amine", "Ousmane", "Computer Science", Map.of("Algorithms", 90, "Data Structures", 80, "Calculus", 85)),
                new StudentEntity("Lily-Ann", "Smith", "Mathematics", Map.of("Algorithms", 80, "Data Structures", 75, "Calculus", 88)),
                new StudentEntity("Li", "Wei", "Computer Science", Map.of("Algorithms", 92, "Data Structures", 89, "Calculus", 88)),
                new StudentEntity("Jessica", "Rodriguez", "Mathematics", Map.of("Algorithms", 85, "Data Structures", 80, "Calculus", 89)));
        String major = "Computer Science";
        int result = Answertwo.findAnswer(students, major);
        System.out.println(result);
    }

}

class StudentEntity {
    private String firstname;
    private String lastname;
    private String major;
    private Map<String, Integer> grades;

    public StudentEntity(String firstname, String lastname, String major, Map<String, Integer> grades) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.major = major;
        this.grades = grades;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMajor() {
        return major;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }
}



