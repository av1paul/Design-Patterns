package org.avi.proxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, String employeeId) {
        System.out.println("Creating employee with id: " + employeeId);
    }

    @Override
    public void get(String client, String employeeId) {
        System.out.println("Getting employee with id: " + employeeId);
    }
}
