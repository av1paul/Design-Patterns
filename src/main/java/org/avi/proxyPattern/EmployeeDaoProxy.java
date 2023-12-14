package org.avi.proxyPattern;

public class EmployeeDaoProxy implements EmployeeDao {

    private EmployeeDao employeeDao = new EmployeeDaoImpl();


    @Override
    public void create(String client, String employeeId) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDao.create(client, employeeId);
        } else {
            throw new Exception("Access Denied");
        }
    }

    @Override
    public void get(String client, String employeeId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")) {
            employeeDao.get(client, employeeId);
        } else {
            throw new Exception("Access Denied");
        }
    }
}
