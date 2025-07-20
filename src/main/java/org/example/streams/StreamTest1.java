package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Jane", "Jack", "Jill", "Joe");

        List<Integer> numberList = List.of(1, 2, 3, 4, 5);

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .sorted()
                .toList();
        System.out.println("Filtered and Sorted Names: " + filteredNames);

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Uppercase Names: " + upperCaseNames);

        int sum = numberList.stream().reduce(0, Integer::sum);
        System.out.println("Sum of Numbers: " + sum);

        int[] numbersArray = {1, 2, 3, 4, 15};
        List<Integer> list = Arrays.stream(numbersArray)
                .boxed()
                .toList();
        int sum1 = list.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of Numbers from Array: " + sum1);

        List<String> sortedNames = names.stream()
                .sorted()
                .toList();
        System.out.println("Sorted Names: " + sortedNames);

        List<String> sortedNames1 = names.stream()
                .sorted().
                collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames1);
    }
}
