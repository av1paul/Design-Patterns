package org.avi.facadePattern;

public class Main {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade(new EmployeeDao());
        employeeFacade.add();
        employeeFacade.get();
    }
}
