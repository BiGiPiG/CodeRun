package CodeRun.Who_has_more_queens_440;

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);

        int[] gamers = new int[4];
        for (int i = 0; i < 4; i++) {
            gamers[i] = in.nextInt();
        }

        Arrays.sort(gamers);
        int count = 0;
        int sum = 0;
        int index = 0;
        while (index < 4) {
            if (gamers[index] > 4 || sum + gamers[index] > 4) {
                count++;
            } else if (sum + gamers[index] <= 4) {
                sum += gamers[index];
            }
            index++;
        }
        if (sum < 2 && count == 0) count += 1;
        System.out.println(count);
    }
}
