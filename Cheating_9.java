package CodeRun;

import java.util.Scanner;
import java.util.ArrayList;

public class Cheating_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a - 1).add(b - 1);
            graph.get(b - 1).add(a - 1);
        }

        ArrayList<Integer> used = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            used.add(0);
        }

        boolean result = true;
        for (int i = 0; i < n; i++) {
            if (used.get(i) == 0) {
                result = dfs(i, graph, used, 1);
                if (!result) {
                    break;
                }
            }
        }

        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean dfs(int V, ArrayList<ArrayList<Integer>> G, ArrayList<Integer> used, int color) {
        used.set(V, color);
        for (int next : G.get(V)) {
            if (used.get(next) == 0) {
                if (!dfs(next, G, used, 3 - color)) {
                    return false;
                }
            } else if (color == used.get(next)) {
                return false;
            }
        }
        return true;
    }
}
