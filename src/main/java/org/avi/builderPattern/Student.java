package org.avi.builderPattern;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.getName();
        this.age = studentBuilder.getAge();
        this.subjects = studentBuilder.getSubjects();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subjects=" + subjects +
                '}';
    }
}
