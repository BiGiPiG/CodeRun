package CodeRun.Frequent_element_360;

import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long key = sc.nextLong();
            long count = map.getOrDefault(key, (long) 0);
            map.put(key, count + 1);
        }

        long max = 0;
        long num = Long.MIN_VALUE;
        for (var pair : map.entrySet()) {
            if (pair.getValue() > max) {
                max = pair.getValue();
                num = pair.getKey();
            } else if (pair.getValue() == max) {
                if (pair.getKey() > num) {
                    num = pair.getKey();
                }
            }
        }
        System.out.println(num);
    }
}
