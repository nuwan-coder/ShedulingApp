package com.shedulingApp.model;

/**
 *
 * @author Nuwan S Karunarathna
 * this is the employee model class
 */
public class Employee {
    //this is the employee id
    private int id;
    
    //this is the employee name
    private String name;
    
    //this is the employee working days
    private String[] workingDays;

    
    //default constractor
    public Employee() {
    }

    //constractor
    public Employee(int id, String name, String[] workingDays) {
        this.id = id;
        this.name = name;
        this.workingDays = workingDays;
    }

    //get employee id method
    public int getId() {
        return id;
    }

    //set employee id method
    public void setId(int id) {
        this.id = id;
    }

    //get employee name method
    public String getName() {
        return name;
    }

    //set employee name method
    public void setName(String name) {
        this.name = name;
    }

    //get employee working days
    public String[] getWorkingDays() {
        return workingDays;
    }

    //set employee working days method
    public void setWorkingDays(String[] workingDays) {
        this.workingDays = workingDays;
    }
    
    
}
