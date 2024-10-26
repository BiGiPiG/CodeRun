import java.util.Scanner;

public class Another_number_theory_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.print(gcd(a, b));
        System.out.print(" ");
        System.out.println((a / gcd(a, b)) * gcd(a, b) * (b / gcd(a, b)));
    }

    public static long gcd(long a, long b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }
}