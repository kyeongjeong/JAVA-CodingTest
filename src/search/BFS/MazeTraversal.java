package search.BFS;

import java.util.*;
import java.io.*;

public class MazeTraversal {

    static int N, M;
    static int[][] maze;
    static boolean[][] visited;

    // 이동 방향: 상, 하, 좌, 우
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//
//        maze = new int[N][M];
//        visited = new boolean[N][M];
//
//        // 입력을 받는 부분 (공백 없이 0과 1로만 이루어진 입력을 처리)
//        for(int i = 0; i < N; i++) {
//            String line = bf.readLine();
//            for(int j = 0; j < M; j++) {
//                maze[i][j] = line.charAt(j) - '0';  // char을 int로 변환
//            }
//        }
//
//        // BFS 탐색 시작
//        BFS(0, 0);
//
//        // 목적지까지의 최단 거리 출력 (N-1, M-1 위치 값)
//        System.out.println(maze[N-1][M-1]);
//    }

    public static void BFS(int x, int y) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        visited[x][y] = true;  // 시작점 방문 처리

        while(!q.isEmpty()) {
            int[] now = q.poll();
            int nowX = now[0];
            int nowY = now[1];

            // 네 방향으로 탐색
            for(int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                // 범위를 벗어나는 경우를 무시
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }

                // 방문한 적이 있거나 벽인 경우를 무시
                if (visited[nextX][nextY] || maze[nextX][nextY] == 0) {
                    continue;
                }

                // 이동할 수 있는 경우 큐에 넣고, 이전 칸의 거리 +1 처리
                q.add(new int[] {nextX, nextY});
                maze[nextX][nextY] = maze[nowX][nowY] + 1;
                visited[nextX][nextY] = true;
            }
        }
    }
}
