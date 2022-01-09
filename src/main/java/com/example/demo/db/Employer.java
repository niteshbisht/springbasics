package com.example.demo.db;

import java.util.ArrayList;
import java.util.List;

public class Employer {
    int id;
    List<Integer> employees;


    public Employer(int id) {
        this.id = id;
        employees = new ArrayList<>();
    }

    public void printIdOfEmployer() {
        System.out.println("Employer id =>"+ id);
    }

    public void addEmployeeId(int id) {
        employees.add(id);
    }

    public List<Integer> getEmployees() {
        return employees;
    }
}
