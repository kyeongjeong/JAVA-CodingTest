package tree.explorer;

import java.util.*;
import java.io.*;

public class LeafNodeCounter {

    static ArrayList<Integer>[] tree;
    static boolean[] visited;
    static int answer = 0;
    static int delNode = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(bf.readLine());
        tree = new ArrayList[N];
        visited = new boolean[N];

        int root = 0;
        for (int i = 0; i < N; i++) {
            tree[i] = new ArrayList<>();
        }

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            int p = Integer.parseInt(st.nextToken());
            if (p != -1) {
                tree[i].add(p);
                tree[p].add(i);
            } else {
                root = i;
            }
        }

        delNode = Integer.parseInt(bf.readLine());
        if (delNode == root) {
            System.out.println(0);
        } else {
            DFS(root);
            System.out.println(answer);
        }
    }

    static void DFS(int num) {
        visited[num] = true;
        int curNode = 0;
        for (int i : tree[num]) {
            if (!visited[i] && i != delNode) {
                curNode++;
                DFS(i);
            }
        }
        if (curNode == 0) {
            answer++;
        }
    }
}
