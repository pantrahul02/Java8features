package org.example;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class TestOccuranceChar {
    public static void main(String[] args) {

        String input ="character";
        input= "aabbbcddbb";

        Map<Character, Integer> charCount = new HashMap<>();
        for(char c: input.toCharArray()){
           if(charCount.containsKey(c)){
               charCount.put(c, charCount.get(c)+1);
           }else{
               charCount.put(c, 1);
           }
        }
        System.out.println("*****Occurance of Each Character in given input*********");
        charCount.entrySet().forEach(entry-> {
            //System.out.println(entry.getKey()+ " "+entry.getValue());
            System.out.print(entry.getKey()+""+entry.getValue());
        });
    }
}
