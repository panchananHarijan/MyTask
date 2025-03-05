package com.practic.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueEmployeeFilter {
    public static void main(String[] args) {
        List<EmployeeDetails> emp=Arrays.asList(
                new EmployeeDetails("Alice", "HR", 1),
                new EmployeeDetails("Bob", "IT", 2),
                new EmployeeDetails("Alice", "HR", 1),
                new EmployeeDetails("Charlie", "Finance", 3)
        );

        /*String  empLIst = emp.stream().map(EmployeeDetails::getName)
                .distinct()
                .findFirst().orElseThrow(()->new IllegalArgumentException("emp data not found"));
*/

        //unique result
        Set<EmployeeDetails> EmpUnique = emp.stream().distinct().collect(Collectors.toSet());
        EmpUnique.forEach(System.out::println);

    }
}
