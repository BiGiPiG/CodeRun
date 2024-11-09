package CodeRun.Two_teams_422;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        if (a > (b % n == 0 ? b / n : b / n + 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}