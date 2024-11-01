package CodeRun.Private_key_182;

import java.util.Scanner;

public class Private_key_182 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //НОД
        long x = sc.nextLong();
        //НОК
        long y = sc.nextLong();
        //НОД(ka, kb) = k, нок(ka, kb) = kab =>

        if (y % x != 0) {
            System.out.println("0");
        } else {
            long tmp = y / x;
            long count = 0;
            for (long i = 1; i < (long) Math.floor(Math.sqrt(tmp)) + 1; i++) {
                if (tmp % i == 0 && gcd(i, tmp / i) == 1) {
                    if (i == tmp / i) {
                        count++;
                    } else {
                        count += 2;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
