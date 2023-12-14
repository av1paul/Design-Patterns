package org.avi.proxyPattern;

public interface EmployeeDao {

    void create(String client, String employeeId) throws Exception;
    void get(String client, String employeeId) throws Exception;
}
