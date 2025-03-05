package com.practic.java8;

import java.util.Arrays;
import java.util.List;

public class EmployeeCreate {
    public static List<Employee> getAllEmployee() {
        Project p1 = new Project("p001", "geeta", "smartTech", "tech");
        Project p2 = new Project("p002", "facebook", "facebook", "face");
        Project p3 = new Project("p003", "insta", "facebook", "insta");
        Project p4 = new Project("p004", "whats", "facebook", "wats");
        Project p5 = new Project("p005", "google", "Google", "googl");
        Project p6 = new Project("p006", "youtb", "Google", "youtb");
        Project p7 = new Project("p007", "gmail", "Google", "gmail");
        Project p8 = new Project("p008", "gcp", "Google", "gcp");
        Project p9 = new Project("p009", "gemini", "Google", "gemini");
        Project p10 = new Project("p0010", "op", "Microsoft", "op");


        Employee e1 = new Employee(1, "John deo", "Development", Arrays.asList(p1), 80000, "Male");
        Employee e2 = new Employee(2, "Jane smith", "HR", Arrays.asList(p2), 50000, "Male");
        Employee e3 = new Employee(3, "Robert", "Development", Arrays.asList(p3), 90000, "Male");
        Employee e4 = new Employee(4, "Panchu babu", "Development", Arrays.asList(p4), 95000, "Male");
        Employee e5 = new Employee(5, "Hemant Majhi", "Mareting", Arrays.asList(p5), 80000, "Female");
        Employee e6 = new Employee(6, "Laxmi ", "Salses", Arrays.asList(p6), 60000, "Female");
        Employee e7 = new Employee(7, "Namita", "Development", Arrays.asList(p7), 70000, "Female");
        Employee e8 = new Employee(8, "Rohit", "HR", Arrays.asList(p8), 80000, "Male");
        Employee e9 = new Employee(9, "Lipsa", "Development", Arrays.asList(p9), 75000, "Female");
        Employee e10 = new Employee(10, "Sima", "HR", Arrays.asList(p10), 55000, "Female");

        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);


    }
}
