package CodeRun.City_of_Che_93;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[] dist = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.parseInt(st.nextToken());
        }

        int lPtr = 0;
        int rPtr = 0;
        long count = 0;
        while (rPtr != n) {
            while (rPtr != n && (dist[rPtr] - dist[lPtr]) <= r) {
                rPtr++;
            }
            count += n - rPtr;
            lPtr++;
        }
        System.out.println(count);
    }
}
