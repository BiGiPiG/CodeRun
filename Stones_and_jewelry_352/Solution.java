package CodeRun.Stones_and_jewelry_352;

import java.util.Scanner;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String j = sc.nextLine();
        String s = sc.nextLine();

        HashSet<Character> set = new HashSet<>();
        for (var elem : j.toCharArray()) {
            set.add(elem);
        }

        int count = 0;
        for (var elem : s.toCharArray()) {
            if (set.contains(elem)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
