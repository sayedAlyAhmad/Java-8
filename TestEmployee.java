package com.sayed.streams.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestEmployee {

    public static void main(String[] args) {

//        List list = new ArrayList();
        List<Employee> emp = new ArrayList();
        Employee emp1 = new Employee(1000, "sayed", 100);
        Employee emp2 = new Employee(1001, "mahmo", 101);
        Employee emp3 = new Employee(1002, "alyii", 103);
        Employee emp4 = new Employee(1003, "ahmed", 104);
        Employee emp5 = new Employee(1004, "saied", 105);

        // 
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);
        emp.add(emp5);

        List<Integer> idsList = emp.stream().map(Employee::getId).collect(Collectors.toList());
        List<String> namesList = emp.stream().map(Employee::getName).collect(Collectors.toList());

        Stream empStream = emp.stream().map(e -> e.getId() + " " + e.getName() + " " + e.getSallary());
//        GET LIST OF EMPLOYEE
        empStream.forEach(e -> System.out.println(e));
//        GET LIST OF IDS
        idsList.forEach(id -> System.out.println("ID:: " + id));
//       GET LIST OF NAMES
        namesList.forEach(name -> System.out.println("Name:: " + name));
//        

    }

}
