package search.DFS;
import java.util.*;
import java.io.*;

public class CountConnectedComponents {

    static boolean[] isVisited;
    static ArrayList<Integer>[] numsList;

//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//
//        numsList = new ArrayList[N+1];
//        isVisited = new boolean[N+1];
//
//        for(int i = 1; i < N+1; i++) {
//            numsList[i] = new ArrayList<>();
//        }
//
//        for(int i = 0; i < M; i++) {
//            st = new StringTokenizer(bf.readLine());
//            int from = Integer.parseInt(st.nextToken());
//            int to = Integer.parseInt(st.nextToken());
//            numsList[from].add(to);
//            numsList[to].add(from);
//        }
//
//        int count = 0;
//        for(int i = 1; i < N+1; i++) {
//            if(!isVisited[i]) {
//                ++count;
//                DFS(i);
//            }
//        }
//        System.out.println(count);
//    }
//
//    public static void DFS(int i) {
//
//        if(isVisited[i]) {
//            return;
//        }
//
//        isVisited[i] = true;
//        for(int j : numsList[i]) {
//            if(isVisited[j] == false) {
//                DFS(j);
//            }
//        }
//    }
}