package CodeRun.Error_204;

import java.util.Scanner;

public class Error_204 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //количество серверов
        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        double probability = 0;

        //считывание данных и расчет вероятности того, что произошла ошибка
        for (int i = 0;i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i][0] = a;
            arr[i][1] = b;
            probability += a / 100.0 * b / 100.0;
        }

        //расчет вероятности того, что ошибка произошла на i-ом сервере по теореме Байеса
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] / 100.0 * arr[i][1] / 100.0 / probability);
        }

    }
}
