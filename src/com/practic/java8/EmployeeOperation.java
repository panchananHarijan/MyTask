package com.practic.java8;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeOperation {
    public static void main(String[] args) {
        List<Employee> allEmployee = EmployeeCreate.getAllEmployee();
        //foreach
        // allEmployee.forEach(n-> System.out.println(n.getName()+":"+n.getSalary()));
        // allEmployee.forEach(System.out::println);

        //filter
        List<Employee> deptlist = allEmployee.stream().filter(n -> n.getDept()
                        .equalsIgnoreCase("Development") && n.getSalary() >= 80000)
                .collect(Collectors.toList());

        // System.out.println(deptlist);

        //filter using map
        Map<Integer, Double> developmentEmployee = allEmployee.stream().filter(n -> n.getDept()
                        .equalsIgnoreCase("Development") && n.getSalary() >= 80000)
                .collect(Collectors.toMap(Employee::getId, Employee::getSalary));
        // System.out.println(developmentEmployee);


        //map
        List<String> allDept = allEmployee.stream()
                .map(Employee::getDept)
                .distinct()
                .collect(Collectors.toList());

        // System.out.println(allDept);

        //flat map
        List<String> collect = allEmployee.stream().flatMap(e -> e.getProject().stream())
                .map(e -> e.getName())
                .collect(Collectors.toList());

        // System.out.println(collect);

        //sorted
        //accend
        List<Employee> sortedSalaryAsc = allEmployee.stream().sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        // sortedSalaryAsc.get(0);

        // sortedSalary.forEach(System.out::println);

        //desc order
        List<Employee> sortedSalaryDec = allEmployee.stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))
                .collect(Collectors.toList());

        // sortedSalaryDec.forEach(System.out::println);
        ///sortedSalaryDec.get(0);


        //min & Max
        Optional<Employee> max = allEmployee.stream().max(Comparator
                .comparingDouble(Employee::getSalary));
        //System.out.println("Heighest paid employee::"+max);

        //min
        Optional<Employee> min = allEmployee.stream().min(Comparator
                .comparingDouble(Employee::getSalary));
        //System.out.println("Lowest paid employee::"+min);


        //grouping by
        Map<String, List<Employee>> groupByGender = allEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getGender));
        //System.out.println(groupByGender);

        //grouping by gender->[name]
       Map<String,List<String>> empGroupByGender= allEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors
                        .mapping(Employee::getName,Collectors.toList())));


        //System.out.println(empGroupByGender);


        //gender->[count]
        Map<String, Long> genderCount = allEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        //System.out.println(genderCount);


        //findFirst()
        Optional<Employee> findFirstDev = allEmployee.stream()
                .filter(e -> e.getDept().equalsIgnoreCase("Development"))
                .findFirst();
       /* System.out.println(findFirstDev.get());//if development is not there then given NPException

        if(findFirstDev.isPresent()){
            System.out.println(findFirstDev.get());
        }
        findFirstDev.ifPresent(e->System.out.println(e.getName()));*/
        //findFirst()
        /*Employee findFirst = allEmployee.stream()
                .filter(e -> e.getDept().equalsIgnoreCase("Developement"))
                .findFirst().orElseThrow(()->new IllegalArgumentException("Employee not found"));
*/
        //System.out.println(findFirst);

        //findAny()
        /*Employee findAny= allEmployee.stream()
                .filter(e -> e.getDept().equalsIgnoreCase("Developement"))
                .findAny().orElseThrow(()->new IllegalArgumentException("Employee not found"));
*/
        // System.out.println(findAny);


        //limit
        List<Employee> collect1 = allEmployee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());

        System.out.println(collect1);


    }
}
