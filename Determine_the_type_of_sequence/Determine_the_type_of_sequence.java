package CodeRun.Determine_the_type_of_sequence;

import java.util.Scanner;
import java.util.ArrayList;

public class Determine_the_type_of_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int x;
        while (true) {
            x = sc.nextInt();
            if (x == - 2 * Math.pow(10, 9)) {
                break;
            }
            list.add(x);
        }

        boolean flag = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if ((int)list.get(i) != (int)list.get(i + 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("CONSTANT");
            return;
        }

        flag = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (!((int)list.get(i) < (int)list.get(i + 1))) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("ASCENDING");
            return;
        }

        flag = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (!((int)list.get(i) <= (int)list.get(i + 1))) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("WEAKLY ASCENDING");
            return;
        }

        flag = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (!((int)list.get(i) > (int)list.get(i + 1))) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("DESCENDING");
            return;
        }

        flag = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (!((int)list.get(i) >= (int)list.get(i + 1))) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("WEAKLY DESCENDING");
            return;
        }

        System.out.println("RANDOM");
    }
}
