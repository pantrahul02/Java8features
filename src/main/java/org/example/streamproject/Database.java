package org.example.streamproject;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<Employee> getEmployees(){
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(176,"Rohan","IT",60000));
        emp.add(new Employee(388,"Eugene","IT",90000));
        emp.add(new Employee(470,"Subhashini","Finance",600000));
        emp.add(new Employee(624,"Vishal","CORE",80000));
        emp.add(new Employee(776,"Sourav","Social",90000));
        emp.add(new Employee(867,"Prakash","Admin",100000));
        return emp;
    }
}
