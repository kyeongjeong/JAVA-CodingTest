package search.BFS;

import java.util.*;
import java.io.*;

public class DFSAndBFSProgram {

    static boolean[] dfsVisited;
    static boolean[] bfsVisited;
    static ArrayList<Integer>[] nums;
    static StringBuilder sb;

//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        sb = new StringBuilder();
//
//        // 입력 받기
//        int N = Integer.parseInt(st.nextToken()); // 정점의 수
//        int M = Integer.parseInt(st.nextToken()); // 간선의 수
//        int V = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점
//
//        dfsVisited = new boolean[N+1];  // DFS 방문 체크 배열
//        bfsVisited = new boolean[N+1];  // BFS 방문 체크 배열
//        nums = new ArrayList[N+1];  // 인접 리스트
//
//        // 인접 리스트 초기화
//        for(int i = 1; i < N+1; i++) {
//            nums[i] = new ArrayList<>();
//        }
//
//        // 간선 입력 받기
//        for(int i = 0; i < M; i++) {
//            st = new StringTokenizer(bf.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            nums[a].add(b);
//            nums[b].add(a);
//        }
//
//        // 인접 리스트 정렬 (문제 요구사항에 맞게 정점 번호가 작은 것부터 방문)
//        for(int i = 1; i < N+1; i++) {
//            Collections.sort(nums[i]);
//        }
//
//        // DFS 실행
//        DFS(V);
//        sb.append('\n');
//
//        // BFS 실행
//        BFS(V);
//        sb.append('\n');
//
//        // 결과 출력
//        System.out.println(sb);
//    }

    // DFS (깊이 우선 탐색)
    public static void DFS(int i) {
        if(dfsVisited[i]) {  // 이미 방문한 경우
            return;
        }

        sb.append(i).append(" ");  // 방문한 노드 출력
        dfsVisited[i] = true;  // 방문 체크

        for(int j : nums[i]) {  // 인접 노드 탐색
            if(!dfsVisited[j]) {
                DFS(j);  // 재귀 호출로 계속 탐색
            }
        }
    }

    // BFS (너비 우선 탐색)
    public static void BFS(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);  // 시작 노드를 큐에 삽입
        bfsVisited[i] = true;  // 방문 체크

        while(!q.isEmpty()) {
            int now = q.poll();  // 큐에서 하나 꺼내기
            sb.append(now).append(" ");  // 방문한 노드 출력

            for(int j : nums[now]) {  // 인접 노드 탐색
                if(!bfsVisited[j]) {
                    q.add(j);  // 방문하지 않은 인접 노드를 큐에 삽입
                    bfsVisited[j] = true;  // 방문 체크
                }
            }
        }
    }
}
