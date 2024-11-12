package CodeRun.Dividers_435;

import java.util.Scanner;

public class Solution {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int maxNum = 0;
        for (int i = 1; i <= n; i++) {
            int count = find_dividers(i);
            if (count >= max) {
                max = count;
                maxNum = i;
            }
        }
        System.out.println(maxNum);
        System.out.println(max);
    }

    public static int find_dividers(int n) {
        int cntDiv = 0;
        for (int i = 1; i < Math.floor(Math.sqrt(n)) + 1; i++) {
            if (n % i == 0) {
                if (n / i != i) {
                    cntDiv += 2;
                } else {
                    cntDiv += 1;
                }
            }
        }
        return cntDiv;
    }
}
