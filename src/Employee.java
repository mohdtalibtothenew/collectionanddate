//uestion 4 Write a program to sort Employee objects based on highest salary using Comparator. Employee class{ Double Age; Double Salary; String Name;}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
    Double Age;
    Double Salary;
    String name;

    public Employee(Double Age, Double Salary, String name) {
        this.Age = Age;
       this.Salary = Salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Age=" + Age +
                ", Salary=" + Salary +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Employee employee) {
        return (int)(Salary-this.Salary);
    }

    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<Employee>();
        Employee emp1 = new Employee(23.00, 53000.00, "Talib");
        Employee emp2 = new Employee(22.00, 52000.00, "Sumit");
        Employee emp3 = new Employee(24.00, 51000.00, "Anuj");
        Employee emp4 = new Employee(21.00,  50000.00, "Shivani");

        employee.add(emp1);
        employee.add(emp2);
        employee.add(emp3);
        employee.add(emp4);
        Collections.sort(employee);
        System.out.println(employee.toString());

    }



}
