package com.xdu.javacoretech_1.demo9;


import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 *注意在map中不能有相同的key
 * K，V
 * value值可以为null
 *
 *
 * hashmap
 *LinkedHashmap
 *
 *
 * treemap
 *
 *
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("ss","ad");
        hashMap.get("ss");
        System.out.println(hashMap.toString());

        LinkedHashMap linkedHashMap = new LinkedHashMap();
    }

}
