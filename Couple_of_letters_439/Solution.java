package CodeRun.Couple_of_letters_439;

import java.util.Scanner;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        HashMap<String, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(line, " ");
        while (st.hasMoreTokens()) {
            String word = st.nextToken().trim();
            for (int i = 0; i < word.length() - 1; i++) {
                String pair = word.substring(i, i + 2);
                int count = map.getOrDefault(pair, 0);
                map.put(pair, count + 1);
            }
        }

        int max = 0;
        String maxWord = "";
        for (var entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxWord = entry.getKey();
            } else if (entry.getValue() == max && entry.getKey().compareTo(maxWord) > 0) {
                maxWord = entry.getKey();
                max = entry.getValue();
            }
        }
        System.out.println(maxWord);
    }
}
