package CodeRun.Substring_graph_357;

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {

        //ввод данных
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        String[] words = new String[t];

        for (int i = 0; i < t; i++) {
            words[i] = sc.next();
        }

        //поиск вершин и ребер
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (String word : words) {
            for (int i = 0; i < word.length() - 3; i++) {
                String substr = word.substring(i, i + 4);
                int count = map.getOrDefault(substr, 0);
                set.add(word.substring(i, i + 3));
                set.add(word.substring(i + 1, i + 4));
                map.put(substr, count + 1);
            }
        }

        //вывод количества вершин и ребер
        System.out.println(set.size());
        System.out.println(map.size());

        //вывод ребер и их вес
        for (var elem : map.entrySet()) {
            String firstVer = elem.getKey().substring(0, 3);
            String secondVer = elem.getKey().substring(1, 4);
            System.out.println(firstVer + " " + secondVer + " " + elem.getValue());
        }
    }
}
