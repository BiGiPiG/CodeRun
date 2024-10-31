package CodeRun.The_most_common_word;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;


public class The_most_common_word_50 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Ввод данных и подсчет вхождений
        HashMap<String, Integer> dict = new HashMap<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) {
                continue; // Пропускаем пустые строки
            }
            String[] words = line.split("\\s+"); // Разделяем строку на слова
            for (String word : words) {
                int count = dict.getOrDefault(word, 0);
                dict.put(word, count + 1);
            }
        }

        // Поиск максимального элемента
        int max = 0;
        String mostCommonWord = "";
        for (var entry : dict.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            if (count > max) {
                mostCommonWord = word;
                max = count;
            } else if (count == max) {
                mostCommonWord = word.compareTo(mostCommonWord) < 0 ? word : mostCommonWord;
            }
        }

        System.out.println(mostCommonWord);
        sc.close();
    }
}
