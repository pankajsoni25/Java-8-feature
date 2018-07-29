package app.test.employee;

import java.util.ArrayList;
import java.util.List;

public class GetEmployeeList {

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            employees.add(new Employee("A",20000));
            employees.add(new Employee("B",3000));
            employees.add(new Employee("C",15002));
            employees.add(new Employee("D",1856));
            employees.add(new Employee("E",200));
            employees.add(new Employee("F",50000));
        }
        return employees;
    }
}
