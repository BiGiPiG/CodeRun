package CodeRun.The_Prisoner_of_the_Chateau_dIf;
import java.util.Scanner;
import java.util.Arrays;

public class The_Prisoner_of_the_Chateau_dIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] brick = new int[3];
        int[] hole = new int[2];
        brick[0] = sc.nextInt();
        brick[1] = sc.nextInt();
        brick[2] = sc.nextInt();
        hole[0] = sc.nextInt();
        hole[1] = sc.nextInt();
        Arrays.sort(brick);
        Arrays.sort(hole);
        if (brick[0] <= hole[0] && brick[1] <= hole[1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
