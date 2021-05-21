package com.shedulingApp.model;

import com.shedulingApp.service.EmployeeService;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nuwan S Karunarathna
 * this class responsible to edit default table model
 */
public class MyTableModel extends AbstractTableModel {
    
    //create employee service object
    EmployeeService employeeService = new EmployeeService();
    
    //create empty employee array list to store employee details
    ArrayList<Employee> employees = new ArrayList<>();
    
    //constractor
    public MyTableModel() {
        employees = employeeService.getEmployees();//after adding employee into fake database retive employees data
        addData();//this function add data into table model
    }
    
    //this is header values array
    private String[] columnNames = { "","20/05/2021", "21/05/2021", "22/05/2021",
        "23/05/2021", "24/05/2021" };
    
    //this is column values array
    private Object[][] data = new Object[5][6] ;
    
    //this function add data into the model
    private void addData(){
        
        //this is row count
        int rowCount = employees.size();
        //this is column count
        int columnCount = 6;
        
        //this iteration all employee details and filter some data
        for(int i=0; i<rowCount; i++) {
          for(int j=0; j<columnCount; j++) {
              if(j==0){
                  data[i][j] = employees.get(i).getName();
              }else{
                String[] workDays = employees.get(i).getWorkingDays();
                for ( String workDay: workDays)  
                {  
                   if(columnNames[j]==workDay){
                       data[i][j] = "✓";
                   }else{
                       //nothing to do
                   }
                   
                }
              }
          }
        }
        
    }

    
    //get columncount
    public int getColumnCount() {
      return columnNames.length;
    }

    //get row count
    public int getRowCount() {
      return data.length;
    }

    //this get column name
    public String getColumnName(int col) {
      return columnNames[col];
    }

    //this method get value
    public Object getValueAt(int row, int col) {
      return data[row][col];
    }

}
