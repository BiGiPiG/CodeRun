package CodeRun.Beauty_above_all_94;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] colors = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            colors[i] = Integer.parseInt(st.nextToken());
        }

        int lPtr = 0;
        int rPtr = -1;
        int length = n;
        int count = 0;
        int[] trees = new int[k + 1];

        int resL = 0;
        int resR = n - 1;

        while (rPtr < n) {
            if (count < k) {
                rPtr++;
                if (rPtr < n && trees[colors[rPtr]] == 0) {
                    count++;
                }
                if (rPtr < n) {
                    trees[colors[rPtr]]++;
                }
            }

            if (count == k && rPtr - lPtr < length) {
                length = rPtr - lPtr;
                resL = lPtr;
                resR = rPtr;
            }

            if (count == k) {
                if (trees[colors[lPtr]] == 1) {
                    count--;
                }
                trees[colors[lPtr]]--;
                lPtr++;
            }
        }

        System.out.println((resL + 1) + " " + (resR + 1));
    }
}

/*
for (int lPtr = 0; lPtr < n; lPtr++) {
            while (rPtr < n && count < k) {
                if (trees[colors[rPtr]] == 0) {
                    count++;
                }
                trees[colors[rPtr]]++;
                rPtr++;
            }
            if (count == k && rPtr - lPtr < length) {
                length = rPtr - lPtr;
                resL = lPtr;
                resR = rPtr;
            }
            if (trees[colors[lPtr]] == 1) {
                count--;
            }
            trees[colors[lPtr]]--;
        }
 */