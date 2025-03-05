package com.practic.stream;

import java.util.Objects;

public class EmployeeDetails {
    private String name;
    private String department;
    private int id;

    public EmployeeDetails(String name, String department, int id) {
        this.name = name;
        this.department = department;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDetails that = (EmployeeDetails) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, id);
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", id=" + id +
                '}';
    }
}
