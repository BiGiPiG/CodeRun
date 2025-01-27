package CodeRun;

import java.util.Scanner;

public class Room_area_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        char[][] lab = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            lab[i] = line.toCharArray();
        }

        int[][] used = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                used[i][j] = 0;
            }
        }

        int row = sc.nextInt();
        int column = sc.nextInt();

        int area = 0;
        System.out.println(dfs(row - 1, column - 1, lab, used));
    }

    public static int dfs(int x, int y, char[][] lab,
                          int[][] used) {
        //System.out.println(count + " " + x + " " + y);
        int count = 0;
        if (used[x][y] == 0) {
            count++;
            used[x][y] = 1;
        }
        if (lab[x + 1][y] == '.' && used[x + 1][y] == 0) {
            count += dfs(x + 1, y, lab, used);
        }
        if (lab[x][y - 1] == '.' && used[x][y - 1] == 0) {
            count += dfs(x, y - 1, lab, used);
        }
        if (lab[x - 1][y] == '.' && used[x - 1][y] == 0) {
            count += dfs(x - 1, y, lab, used);
        }
        if (lab[x][y + 1] == '.' && used[x][y + 1] == 0) {
            count += dfs(x, y + 1, lab, used);
        }
        return count;
    }
}
