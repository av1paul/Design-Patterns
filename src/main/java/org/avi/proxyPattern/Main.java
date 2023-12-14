package org.avi.proxyPattern;

public class Main {
    public static void main(String[] args) throws Exception {
        EmployeeDao employeeDao = new EmployeeDaoProxy();

        employeeDao.create("ADMIN", "12345");
        employeeDao.get("USER", "456");
    }
}
