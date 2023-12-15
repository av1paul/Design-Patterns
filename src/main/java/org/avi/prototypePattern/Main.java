package org.avi.prototypePattern;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Avi", 23);
        Student student2 = student1.clone();
        System.out.println(student2);

    }
}
