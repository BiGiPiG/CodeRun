package CodeRun.Unique_elements;

import java.util.Scanner;
import java.util.HashMap;

public class Unique_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int x;
        while (sc.hasNextInt()) {
            x = sc.nextInt();
            int count = map.getOrDefault(x, 0);
            map.put(x, count + 1);
        }

        int count_num = 0;
        for (var elem : map.entrySet()) {
            if (elem.getValue() == 1) {
                count_num++;
            }
        }
        System.out.println(count_num);
    }
}
