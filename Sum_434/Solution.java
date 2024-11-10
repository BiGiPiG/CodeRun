package CodeRun.Sum_434;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static HashSet<ArrayList<Integer>> list = new HashSet<>();

    public static void main(String[] args) {
        //ввод данных
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //вызов функции подсчета способов
        count_sum(new ArrayList<>(), 0, n, n);

        //преобразование множества в список строк
        ArrayList<String> list1 = new ArrayList<>();
        for (var elem : list) {
            StringBuilder sum = new StringBuilder();
            for (var add : elem) {
                sum.append(add).append(" + ");
            }
            // Удаляем последние " + "
            if (sum.length() > 0) {
                sum.setLength(sum.length() - 3);
            }
            list1.add(sum.toString());
        }

        //сортировка строк
        Collections.sort(list1, (s1, s2) -> {
            String[] parts1 = s1.split(" \\+ ");
            String[] parts2 = s2.split(" \\+ ");
            for (int i = 0; i < Math.min(parts1.length, parts2.length); i++) {
                int num1 = Integer.parseInt(parts1[i].trim());
                int num2 = Integer.parseInt(parts2[i].trim());
                if (num1 != num2) {
                    return Integer.compare(num1, num2); // Сравниваем числа
                }
            }
            return Integer.compare(parts1.length, parts2.length); // Если равны, сравниваем длину
        });

        //вывод списка строк
        for (String s : list1) {
            System.out.println(s);
        }

        sc.close();
    }
    //sums - массив со слагаемыми
    //sum - текущая сумма
    //finish - желаемое значение суммы
    //start - начало цикла (так как нужны повторения)
    public static void count_sum(ArrayList<Integer> sums, int sum, int finish, int start) {

        //условия выхода
        if (sum == finish) {
            list.add(new ArrayList<>(sums));
            return;
        } else if (sum > finish) {
            return;
        }

        //перебираем числа в невозрастающем порядке
        for (int i = start; i >= 1; i--) {
            sums.add(i);
            count_sum(sums, sum + i, finish, i);
            sums.remove(sums.size() - 1);
        }
    }
}
