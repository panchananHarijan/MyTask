package com.practic.java8;

import java.util.List;

public class Employee {

    private int id;
    private String name;
    private String dept;
    private List<Project> project;
    private double salary;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public Employee(int id, String name, String dept, List<Project> project, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.project = project;
        this.salary = salary;
        this.gender = gender;
    }

    public Employee() {


    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", project=" + project +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
