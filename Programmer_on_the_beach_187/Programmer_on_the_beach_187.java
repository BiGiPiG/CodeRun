package CodeRun.Programmer_on_the_beach_187;

import java.util.Scanner;
import java.util.Arrays;

public class Programmer_on_the_beach_187 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long minDif;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextLong();
            }
            Arrays.sort(arr);
            minDif = Long.MAX_VALUE;
            for (int j = 0; j < n - 1; j++) {
                long curDif = arr[j] ^ arr[j + 1];
                if (curDif < minDif) {
                    minDif = curDif;
                }
            }
            System.out.println(minDif);
        }
    }
}
