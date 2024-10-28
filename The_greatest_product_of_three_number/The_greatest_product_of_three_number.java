package CodeRun.The_greatest_product_of_three_number;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class The_greatest_product_of_three_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while (sc.hasNextInt()) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        if ((long)arr.get(0) * arr.get(1) * arr.get(arr.size()- 1) > (long)arr.get(arr.size() - 1) * arr.get(arr.size()- 2) * arr.get(arr.size() - 3)) {
            System.out.printf("%d %d %d", arr.get(0), arr.get(1), arr.get(arr.size() - 1));
        } else {
            System.out.printf("%d %d %d", arr.get(arr.size() - 1), arr.get(arr.size() - 2), arr.get(arr.size() - 3));
        }
    }
}
