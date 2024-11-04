package CodeRun.Checkers_344;

import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    public static class Checker {
        //white - 1, black - 0, undef - -1
        private int x;
        private int y;
        private  int color;

        Checker(int x, int y, int color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }

        public int get_color() {
            return color;
        }

        public int get_x() {
            return x;
        }

        public int get_y() {
            return y;
        }
    }

    public static void main(String[] args) {
        //считываем размеры игрового поля
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        //инициализируем поле дефолтными значениями
        Checker[][] map = new Checker[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(map[i], new Checker(-1, -1, -1));
        }

        //считываем белые шашки
        int count_of_white_checkers = sc.nextInt();
        Checker[] white = new Checker[count_of_white_checkers];
        for (int i = 0; i < count_of_white_checkers; i++) {
            int y = sc.nextInt();
            int x = sc.nextInt();
            map[x - 1][y - 1] = new Checker(x - 1, y - 1, 1);
            white[i] = new Checker(x - 1, y - 1, 1);
        }

        //считыввем черные шашки
        int count_of_black_checkers = sc.nextInt();
        Checker[] black = new Checker[count_of_black_checkers];
        for (int i = 0; i < count_of_black_checkers; i++) {
            int y = sc.nextInt();
            int x = sc.nextInt();
            map[x - 1][y - 1] = new Checker(x - 1, y - 1, 0);
            black[i] = new Checker(x - 1, y - 1, 0);
        }

        String queue = sc.next();

        if (queue.equals("white")) {
            for (var checker : white) {
                if (checkMove(checker, n, m, map)) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
        } else {
            for (var checker : black) {
                if (checkMove(checker, n, m, map)) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
        }
    }

    public static boolean checkMove(Checker check, int n, int m, Checker[][] map) {

        // Текущие координаты и цвет противоположной команды
        int curX = check.get_x();
        int curY = check.get_y();
        int opponentColor = check.get_color() == 1 ? 0 : 1;

        // Проверка возможных ходов
        return canMove(curX + 2, curY + 2, curX + 1, curY + 1, opponentColor, n, m, map) ||
                canMove(curX - 2, curY + 2, curX - 1, curY + 1, opponentColor, n, m, map) ||
                canMove(curX - 2, curY - 2, curX - 1, curY - 1, opponentColor, n, m, map) ||
                canMove(curX + 2, curY - 2, curX + 1, curY - 1, opponentColor, n, m, map);
    }

    private static boolean canMove(int targetX, int targetY,
                                   int jumpX, int jumpY,
                                   int opponentColor,
                                   int n,
                                   int m,
                                   Checker[][] map) {

        if (targetX >= 0 && targetX < n && targetY >= 0 && targetY < m) {
            return map[targetX][targetY].get_color() == -1 &&
                    map[jumpX][jumpY].get_color() == opponentColor;
        }

        return false;
    }
}