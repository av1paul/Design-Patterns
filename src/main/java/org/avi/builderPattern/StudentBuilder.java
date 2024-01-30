package org.avi.builderPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class StudentBuilder {

    private String name;
    private int age;
    private List<String> subjects = new ArrayList<>();

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public abstract StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }
}
