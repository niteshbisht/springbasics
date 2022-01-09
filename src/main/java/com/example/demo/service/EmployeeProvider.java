package com.example.demo.service;

import com.example.demo.db.Employer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class EmployeeProvider {

    private Employer stateStreet;
    private Employer morganStanley;

    public EmployeeProvider(Employer stateStreet, Employer morganStanley) {
        this.stateStreet = stateStreet;
        this.morganStanley = morganStanley;
    }

    public Employer getStateStreet() {
        return stateStreet;
    }


    public void showInfoOfEmployer() {
        stateStreet.printIdOfEmployer();
    }

    public void addEmployeeId(int id) {
        stateStreet.addEmployeeId(id);
    }

    public List<Integer> getEmployee() {
        return stateStreet.getEmployees();
    }

    @PostConstruct
    public void displayData() {
        stateStreet.addEmployeeId(10991);
    }
}
