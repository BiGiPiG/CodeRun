package CodeRun.Character_set_251;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class Character_set_251 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //считываем данные
        char[] s = sc.nextLine().toCharArray();
        char[] c = sc.nextLine().toCharArray();
        HashSet<Character> set_of_c = getSet(c);

        //поиск минимальной длины подмассива
        Integer minLength = Integer.MAX_VALUE;
        for (int i = 0; i <= s.length - c.length; i++) {
            for (int j = i + c.length; j <= s.length; j++) {
                char[] subArr = Arrays.copyOfRange(s, i, j);
                HashSet<Character> subSet = getSet(subArr);
                if (subSet.equals(set_of_c) && minLength > subArr.length) {
                    minLength = subArr.length;
                }
            }
        }

        //вывод результата
        System.out.println(minLength.equals(Integer.MAX_VALUE) ? 0 : minLength);
    }

    //функция для перевода массива в множество
    public static HashSet<Character> getSet(char[] arr) {
        HashSet<Character> set = new HashSet<>();
        for (char elem : arr) {
            set.add(elem);
        }
        return set;
    }
}
