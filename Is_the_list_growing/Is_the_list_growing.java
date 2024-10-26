import java.util.Scanner;
import java.util.ArrayList;

public class Is_the_list_growing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}