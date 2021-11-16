/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author akshatajadhav
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String username, String name){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setUsername(username);
        employeeList.add(employee);
        return employee;
    }
    public Employee newEmployee(Employee employee){
        employeeList.add(employee);
        return employee;
    }
}