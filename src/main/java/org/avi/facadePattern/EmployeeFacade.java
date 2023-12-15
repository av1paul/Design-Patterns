package org.avi.facadePattern;

public class EmployeeFacade {

    private EmployeeDao employeeDao;

    public EmployeeFacade(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void add() {
        employeeDao.add();
    }

    public void get() {
        employeeDao.get();
    }
}
