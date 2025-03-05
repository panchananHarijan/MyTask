package com.practic.test;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3};
        Map<Integer, Integer> map = new HashMap();
        for (int value :arr) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
