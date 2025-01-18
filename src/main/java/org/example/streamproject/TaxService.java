package org.example.streamproject;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers() {
        return Database.getEmployees().stream().filter(emp -> emp.getSalary() > 50000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers());
    }
}
