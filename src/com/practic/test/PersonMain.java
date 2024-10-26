package com.practic.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person{
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class PersonMain {
    public static void main(String[] args) {
        List<Person> list= Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 20),
                new Person("Charlie", 30),
                new Person("Diana", 25)
        );

        //grouping by age

        Map<Integer, List<Person>> collect = list.stream().collect(Collectors.groupingBy(person -> person.age));

        //print group result
        collect.forEach((age,person)-> {
            System.out.println("age"+age+":"+person);
        });



    }
}
