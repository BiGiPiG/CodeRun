package CodeRun.OpenCalculator;

import java.util.Scanner;
import java.util.HashSet;

public class OpenCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            HashSet<Integer> set = new HashSet<>();
            set.add(x);
            set.add(y);
            set.add(z);
            scanner.nextLine(); // Очистка буфера после считывания чисел
            String num = scanner.nextLine();

            for (int i = 0; i < num.length(); i++) {
                int charValue = num.charAt(i) - '0'; // Получаем значение символа
                if (!set.contains(charValue)) {
                    set.add(charValue);
                }
            }
            System.out.println(set.size() - 3);
        }
    }
}