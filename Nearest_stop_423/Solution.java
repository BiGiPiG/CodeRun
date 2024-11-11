package CodeRun.Nearest_stop_423;

import java.io.*;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            HashMap<Integer, Integer> stops = new HashMap<>();
            br.readLine();
            //получаем номера остановок
            int i = 1;
            String map = br.readLine();
            for (var elem : map.trim().split(" ")) {
                int number = Integer.parseInt(elem);
                stops.put(i, number);
                i++;
            }
            String tests = br.readLine();
            for (var elem : tests.trim().split(" ")) {
                int number = Integer.parseInt(elem);
                System.out.println(binarySearch(number, stops));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int binarySearch(int x, HashMap<Integer, Integer> map) {
        int l = 1, r = map.size();
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (map.get(mid) == x) {
                l = mid;
                break;
            } else if (map.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        if (map.get(l) == x) {
            while (l - 1 >= 1 && map.get(l - 1) == x) {
                l--;
            }
        } else if (map.get(l) > x && l > 1) {
            if (map.get(l) - x == x - map.get(l - 1) ||
                map.get(l) - x > x - map.get(l - 1)) {
                l--;
            }
        }
        return l;
    }
}
