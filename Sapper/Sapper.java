package CodeRun.Sapper;

import java.util.Scanner;
import java.util.Arrays;

public class Sapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        char[][] arr = new char[n][m];
        int x, y;

        // Заполняем карту нулями
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], '0');
        }

        // Добавляем мины
        for (int i = 0; i < k; i++) {
            y = sc.nextInt() - 1;
            x = sc.nextInt() - 1;
            arr[y][x] = '*';

            // Обновляем карту
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    if (dx == 0 && dy == 0) continue;
                    int newX = y + dx;
                    int newY = x + dy;
                    if (newX >= 0 && newX < n && newY >= 0 && newY < m && arr[newX][newY] != '*') {
                        arr[newX][newY]++;
                    }
                }
            }
        }

        // Выводим карту
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

