package CodeRun.Formatting_the_calendar_381;

import java.util.Scanner;

public class Solution {
    enum Days {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String day = sc.next();

        Days dow = Days.valueOf(day);
        for (int i = 0; i < dow.ordinal(); i++) {
            System.out.print(".. ");
        }
        int num = dow.ordinal();
        for (int i = 1; i <= n; i++) {
            if (num == 7) {
                num %= 7;
                System.out.println();
            }
            String formattedText = String.format("%2s", i).replace(' ', '.');
            System.out.printf("%s ", formattedText);
            num++;
        }
    }
}
