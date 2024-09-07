package dataStructures.twoPointer;
import java.util.*;
import java.io.*;

public class FindGoodNumber {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(bf.readLine());
//        int[] A = new int[N];
//
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        for (int i = 0; i < N; i++) {
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(A);
//
//        int count = 0;
//        for (int k = 0; k < N; k++) {
//
//            int i = 0;
//            int j = N - 1;
//
//            while (i < j) {
//
//                if (i == k) {
//                    i++;
//                    continue;
//                }
//                if (j == k) {
//                    j--;
//                    continue;
//                }
//
//                int sum = A[i] + A[j];
//
//                if (sum == A[k]) {
//                    count++;
//                    break;
//                } else if (sum < A[k]) {
//                    i++;
//                } else {
//                    j--;
//                }
//            }
//        }
//        System.out.println(count);
//    }
}