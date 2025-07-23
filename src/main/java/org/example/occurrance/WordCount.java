package org.example.occurrance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

    public static void main(String[] args) {
        String filePath = "D:\\Garima_python_project\\pyspark200\\large_text_file.txt";
        String wordToFind = "banana";
        int count = findOccurranceOfWord(filePath, wordToFind);
        System.out.println("Occurrance of " + wordToFind + " in given file is- " +count);
    }

    public static int findOccurranceOfWord(String filePath, String word) {
        int count = 0;
        word = word.toLowerCase();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                count = count + countWordLine(line, word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

    public static int countWordLine(String line, String word) {
        String[] words = line.toLowerCase().split("\\s+");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
