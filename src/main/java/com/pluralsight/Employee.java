package com.pluralsight;

public class Employee {
    int employeeId;
    String fullName;
    double hoursWorked;
    double payRate;

// Here we create our constructor so that we can pass the data from the .csv file into here and create our employee objects!
    public Employee(int id, String name, double hours, double payRate){
        this.employeeId = id;
        this.fullName = name;
        this.hoursWorked = hours;
        this.payRate = payRate;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public double getGrossPay(){
        return payRate * hoursWorked;
    }




}
