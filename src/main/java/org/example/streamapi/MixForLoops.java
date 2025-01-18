package org.example.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class MixForLoops {
    public static void main(String[] args) {
        /*List<Integer> nums = List.of(1,2,3,4,5);
        String output = "";
        for(int i=1;i<nums.size();i++)
            output = output + nums.get(i) + " ";

        System.out.println(output);*/

        String input = "programming";
        String output = removeDuplicateChar(input);
        System.out.println(output);

        //nums.forEach(t -> System.out.println(t));
    }

    public static String removeDuplicateChar(String str) {
        return str.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }


}
