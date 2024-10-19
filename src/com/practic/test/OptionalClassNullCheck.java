package com.practic.test;

import java.util.Optional;

public class OptionalClassNullCheck {
    public static void main(String[] args) {
        String val="Mamta";
        Optional<String> value=Optional.ofNullable(val);
        value.ifPresent(v-> System.out.println("value::"+v));
        String defaultValue = value.orElse("Default value");
        System.out.println(defaultValue);
    }
}
