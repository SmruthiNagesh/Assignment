package com.user;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class SortKeys {
    static void MapMethod() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("w", "Hello");
        map.put("x", "Good Morning");
        map.put("y", "World");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        MapMethod();

    }
}