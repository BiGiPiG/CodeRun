package CodeRun.Many_chairs_324;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> out = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            in.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            out.add(sc.nextInt());
        }

        Collections.sort(in);
        Collections.sort(out, Collections.reverseOrder());

        int stop = Math.min(n, m);
        long sum = 0;
        for (int i = 0; i < stop; i++) {
            if (out.get(i) - in.get(i) < 0) {
                break;
            }
            sum += out.get(i) - in.get(i);
        }

        System.out.println(sum);
    }
}
