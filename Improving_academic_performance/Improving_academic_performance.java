package CodeRun.Improving_academic_performance;

import java.util.Scanner;

public class Improving_academic_performance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();


        int x = (int)Math.ceil((3 * a + b - c) / 3.0);
        if (a + b + c == 0) {
            x = 1;
        } else if (x < 0) {
            x = 0;
        }
        System.out.println(x);
    }
}

