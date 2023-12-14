package org.avi.builderPattern;

import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        this.getSubjects().add("OOPS");
        this.getSubjects().add("DSA");
        return this;
    }
}
