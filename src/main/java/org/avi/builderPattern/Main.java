package org.avi.builderPattern;

public class Main {

    public static void main(String[] args) {
        Student student1 = new EngineerStudentBuilder()
                .setName("Avi")
                .setAge(23)
                .build();
        System.out.println(student1);
    }
}
