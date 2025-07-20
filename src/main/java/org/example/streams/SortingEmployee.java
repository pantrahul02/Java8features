package org.example.streams;


import ch.qos.logback.core.model.conditional.ElseModel;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
class Employee {
    private int empId;
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }
}

class Customer {
    private int custId;
    private Long yearlySpending;

    public Customer(int custId, Long yearlySpending) {
        this.custId = custId;
        this.yearlySpending = yearlySpending;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public Long getYearlySpending() {
        return yearlySpending;
    }

    public void setYearlySpending(Long yearlySpending) {
        this.yearlySpending = yearlySpending;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", yearlySpending=" + yearlySpending +
                '}';
    }
}

public class SortingEmployee {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "Pravee"));
        emp.add(new Employee(2, "Rajesh"));
        emp.add(new Employee(3, "jonath"));
        emp.add(new Employee(4, "Eugene"));
        emp.add(new Employee(5, "Nazia"));
        System.out.println("Before Sorting");
        emp.forEach(System.out::println);

        List<Employee> sortedEmployee = emp.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        List<Employee> emp1 = sortedEmployee.stream().filter(e -> e.getName().toLowerCase().startsWith("p")).collect(Collectors.toList());
        System.out.println("List of Name Starts with P-");
        emp1.forEach(System.out::println);

        System.out.println("After Sorting");
        sortedEmployee.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 6, 7, 10);
        System.out.println("Even Numbers");
        numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        Map<Boolean, List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(result);

        List<Customer> cust = new ArrayList<>();
        cust.add(new Customer(1, 20000L));
        cust.add(new Customer(1, 30000L));
        cust.add(new Customer(1, 50000L));
        cust.add(new Customer(1, 2000L));
        cust.add(new Customer(1, 1000L));
        cust.add(new Customer(1, 1500L));

        Map<Boolean, List<Customer>> result1 = cust.stream().collect(Collectors.partitioningBy(c -> c.getYearlySpending() > 5000));


        System.out.println(result1);

    }
}
