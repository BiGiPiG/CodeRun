package CodeRun.DFS_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        ArrayList<Integer> used = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            used.add(0); // Инициализация списка нулями
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list.get(a - 1).add(b - 1);
            list.get(b - 1).add(a - 1);
        }

        ArrayList<Integer> result = dfs(0, list, used);
        System.out.println(result.size());
        Collections.sort(result);
        for (int el : result) {
            System.out.print((el + 1) + " ");
        }
    }

    public static ArrayList<Integer> dfs(int V, ArrayList<ArrayList<Integer>> G, ArrayList<Integer> used) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (used.get(V) == 1) {
            return ans; // Вершина уже использована, ничего не добавляем
        }
        used.set(V, 1);
        ans.add(V);
        for (int v : G.get(V)) {
            ans.addAll(dfs(v, G, used));
        }
        return ans;
    }
}