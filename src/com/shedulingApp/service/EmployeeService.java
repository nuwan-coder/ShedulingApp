package com.shedulingApp.service;

import com.shedulingApp.model.Employee;
import java.util.ArrayList;

/**
 *
 * @author Nuwan S Karunarathna
 * this is the employee service class which returns all employee details
 */
public class EmployeeService {
    
    //this is employee array(fake db)
    ArrayList<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        addEmployees();//save employee into the fake database
    }
    
    //this method add employee into the employees array
    public void addEmployees(){
        String[] workingDaysE1 = {"20/05/2021","22/05/2021","23/05/2021"};
        employees.add(new Employee(1, "Jane Smith", workingDaysE1));
        
        String[] workingDaysE2 = {"23/05/2021","24/05/2021"};
        employees.add(new Employee(2, "Jhon Smith", workingDaysE2));
        
        String[] workingDaysE3 = {"22/05/2021","23/05/2021"};
        employees.add(new Employee(3, "Don Hans", workingDaysE3));
        
        String[] workingDaysE4 = {"21/05/2021","23/05/2021","24/05/2021"};
        employees.add(new Employee(4, "Steve Jhons", workingDaysE4));
        
        String[] workingDaysE5 = {"20/05/2021","22/05/2021","23/05/2021","24/05/2021"};
        employees.add(new Employee(5, "Chris Gale", workingDaysE5));
    }
    
    //this method return list of employee 
    public ArrayList<Employee> getEmployees(){
        return employees;
    } 
    
}
