package com.practic.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("12", "8", "13", "24", "15");
        List<Integer> collect = strings.stream().map(m -> Integer.parseInt(m) * Integer.parseInt(m))
                .collect(Collectors.toList());

        System.out.println(collect);

        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter formater=DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss.SSS");
        String date = formater.format(dateTime);
        System.out.println(date);




    }
}
