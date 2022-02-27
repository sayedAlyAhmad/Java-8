 
package com.sayed.streams.employee;

 
public class Employee {
    
    private int id;
    private String name;
    private double sallary;

    public Employee() {
    }

    public Employee(int id, String name, double sallary) {
        super();
        this.id = id;
        this.name = name;
        this.sallary = sallary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }
    
    
    
    
    
    
}
