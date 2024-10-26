package com.practic.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMamagement {
    public static void main(String[] args) {
        List<Employee> employee= Arrays.asList(
                new Employee("Alice", "Engineering", 75000),
                new Employee("Bob", "Marketing", 60000),
                new Employee("Charlie", "Engineering", 80000),
                new Employee("David", "Sales", 55000),
                new Employee("Eve", "Marketing", 72000)
        );


       //Filtering employee in Engineering Department
        System.out.println("Engineering employee:");
       employee.stream().filter(m->m.getDepartment().equals("Engineering")).forEach(System.out::println);

       //Sort employee by Salary in Descending order
        System.out.println("Employee sorted by salary Decending order");
        //employee.stream().sorted((a,b)-> (int) (b.getSalary()-a.getSalary())).forEach(System.out::println);
       List<Employee> beforeReverse= employee.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
       beforeReverse.forEach(System.out::println);

       //Calculate the average salary of the Employee Marketing
        double marketingSalary=employee.stream().filter(m->m.getDepartment().equals("Marketing")).mapToDouble(Employee::getSalary).average().orElse(0);

        System.out.println("Marketing average Slary::"+marketingSalary);

        //Group employee by Department
        System.out.println("Group by Department employee");

        Map<String, List<Employee>> collect = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
       for (Map.Entry<String, List<Employee>> stringListEntry : collect.entrySet()) {
            System.out.println(stringListEntry.getKey()+" "+stringListEntry.getValue());

        }
       // System.out.println(collect);


    }
}
