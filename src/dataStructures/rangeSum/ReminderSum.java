package dataStructures.rangeSum;

import java.util.*;
import java.io.*;

public class ReminderSum {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        long[] S = new long[N + 1];
//        long[] remainder = new long[M];
//
//        st = new StringTokenizer(bf.readLine());
//        for(int i = 1; i < N + 1; i++) {
//            S[i] = (S[i-1] + Integer.parseInt(st.nextToken())) % M;
//            ++remainder[(int)S[i]];
//        }
//
//        long total = (int)remainder[0];
//        for(int i = 0; i < M; i++) {
//            if(remainder[i] > 1) {
//                total += remainder[i] * (remainder[i] - 1) / 2;
//            }
//        }
//        System.out.println(total);
//    }
}
