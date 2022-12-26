package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
        Map<String, String> map= new HashMap<>();
        map.put("Navin","1001");
        map.put( "Pooja","1002");
        map.put("Ali","1003");
        map.put("Mahesh","1004");
        map.put("Archana","1005" );
        System.out.println(map.get("Pooja"));
        System.out.println(map.containsKey("Ali"));
        System.out.println(map.containsValue("1004"));
        map.put("Navin","1006");
        System.out.println(map);
    }
}
