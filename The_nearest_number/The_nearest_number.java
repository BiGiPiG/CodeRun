package CodeRun.The_nearest_number;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class The_nearest_number {
    public static void main(String[] args) {

        //ввод данных
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>() {
        };
        for (int i = 1; i <= n; i++) {
            list.add(sc.nextInt());
        }
        int x = sc.nextInt();
        list.add(x);

        //сортировка данных
        Collections.sort(list);

        //поиск элемента в отсортированном листе
        int ind = Collections.binarySearch(list, x);

        //поиск ближайшего элемента
        if (ind == 0) {
            System.out.println(list.get(1));
        } else if (ind == n) {
            System.out.println(list.get(n - 1));
        } else {
            if (Math.abs(list.get(ind - 1) - list.get(ind)) < Math.abs(list.get(ind + 1) - list.get(ind))) {
                System.out.println(list.get(ind - 1));
            } else {
                System.out.println(list.get(ind + 1));
            }
        }
    }
}
