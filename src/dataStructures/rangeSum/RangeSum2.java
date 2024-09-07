package dataStructures.rangeSum;

import java.util.*;
import java.io.*;

public class RangeSum2 {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//
//        int[][] S = new int[N][N];
//
//        for(int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            for(int j = 0; j < N; j++) {
//                int num = Integer.parseInt(st.nextToken());
//                if(j == 0) {
//                    S[i][j] = num;
//                }
//                else {
//                    S[i][j] = S[i][j-1] + num;
//                }
//            }
//        }
//        for(int i = 0; i < M; i++) {
//            st = new StringTokenizer(br.readLine());
//            int x1 = Integer.parseInt(st.nextToken()) - 1;
//            int y1 = Integer.parseInt(st.nextToken()) - 1;
//            int x2 = Integer.parseInt(st.nextToken()) - 1;
//            int y2 = Integer.parseInt(st.nextToken()) - 1;
//            int sum = 0;
//
//            for(int j = x1; j <= x2; j++) {
//
//                if(y1 == 0) {
//                    sum += S[j][y2];
//                }
//                else {
//                    sum += S[j][y2] - S[j][y1-1];
//                }
//            }
//            sb.append(sum + "\n");
//        }
//        System.out.println(sb);
//    }
}
