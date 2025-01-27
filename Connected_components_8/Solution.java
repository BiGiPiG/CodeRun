package CodeRun.Connected_components_8;

import java.util.Scanner;
import  java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

        HashMap<Integer, ArrayList<Integer>> result = new HashMap<>();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
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

        int component = 0;
        for (int i = 0; i < n; i++) {
            if (used.get(i) == 0) {
                component++;
                result.put(component, new ArrayList<>());
                dfs(i, graph, used, component, result);
            }
        }

        System.out.println(component);
        for (int i = 0; i < component; i++) {
            System.out.println(result.get(i + 1).size());
            for (int v : result.get(i + 1)) {
                System.out.print((v + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void dfs(int V, ArrayList<ArrayList<Integer>> G, ArrayList<Integer> used,
             int component, HashMap<Integer, ArrayList<Integer>> map) {
        map.get(component).add(V);
        used.set(V, component);
        for (int v : G.get(V)) {
            if (used.get(v) == 0) {
                dfs(v, G, used, component, map);
            }
        }
    }
}
