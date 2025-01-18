package org.example.streamapi;

import java.util.HashMap;
import java.util.Map;

public class FindCharCountInMap {
    public static void main(String[] args) {
        String str = "hello world";

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println(charCountMap);
    }
}
