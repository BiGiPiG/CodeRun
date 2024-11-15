package CodeRun.Scoreboard_441;

import java.util.Scanner;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //количество игроков
        int n = sc.nextInt();
        sc.nextLine();

        //считываем их номера
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sc.nextLine(), 0);
        }

        //количество результативных деуствий
        int m = sc.nextInt();
        sc.nextLine();

        int aScore = 0;
        int bScore = 0;

        //считываем данные о них
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine(), " :");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            int count = map.get(name);
            count += (A - aScore) + (B - bScore);
            aScore = A;
            bScore = B;
            map.put(name, count);
        }

        int maxScore = 0;
        String greatestPlayer = "";
        for (var entry : map.entrySet()) {
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                greatestPlayer = entry.getKey();
            } else if (entry.getValue() == maxScore) {
                if (greatestPlayer.compareTo(entry.getKey()) < 0) {
                    greatestPlayer = entry.getKey();
                }
            }
        }

        System.out.println(greatestPlayer + " " + maxScore);
    }
}
