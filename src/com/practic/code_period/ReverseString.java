package com.practic.code_period;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String str="hyderabad";
        String s = str.chars().mapToObj(x -> (char) x).map(m -> String.valueOf(m))
                .reduce((s1, s2) -> s2 + s1)
                .orElse("");
        System.out.println("Reverse String::"+s);
       // System.out.println(new StringBuilder(str).reverse().toString());
        String string = new StringBuilder(str).reverse().toString();
        System.out.println(string);

        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = formater.format(dateTime);
       // System.out.println(date);

        //Using optional class

        String dat="03-03-2025";
        DateTimeFormatter form=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Optional<LocalDate> option=Optional.ofNullable(dat)
                .map(dt-> LocalDate.parse(dt,form));

        DateTimeFormatter dm=DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String invalidDate = option.map(dt -> dt.format(dm)).orElse("invalid Date");
       // System.out.println(invalidDate);

        String collect = str.chars().mapToObj(x -> (char) x).map(c -> String.valueOf(c).toUpperCase())
                .collect(Collectors.joining());

       // System.out.println(collect);


        Optional<String> optionalNull = Optional.ofNullable(str);
        String defaultValue = optionalNull.map(String::toUpperCase).orElse("Default value");
        System.out.println(defaultValue);


    }
}
