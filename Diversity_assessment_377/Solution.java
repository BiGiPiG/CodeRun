package CodeRun.Diversity_assessment_377;

import java.io.*;
import java.util.HashMap;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Long, Long> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().trim().split(" ");
            long product_id = Long.parseLong(s[0]);
            long product_category = Long.parseLong(s[1]);
            map.put(product_id, product_category);
        }

        String line  = br.readLine();
        long[] order = Arrays.stream(line.split(" ")).mapToLong(Long::parseLong).toArray();
        HashMap<Long, Integer> ord = new HashMap<>();
        int min_dif = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = ord.getOrDefault(map.get(order[i]), -1);
            if (num != -1) {
                if (min_dif > i - num) {
                    min_dif = i - num;
                }
            }
            ord.put(map.get(order[i]), i);
        }
        min_dif = min_dif == Integer.MAX_VALUE ? n : min_dif;
        System.out.println(min_dif);
    }
}
