package search.binarySearch;
import java.util.*;
import java.io.*;

public class FindTargetInteger {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(bf.readLine());
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        int[] A = new int[N];
//        for(int i = 0; i < N; i++) {
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(A);
//
//        int M = Integer.parseInt(bf.readLine());
//        st = new StringTokenizer(bf.readLine());
//        for(int i = 0; i < M; i++) {
//            int target = Integer.parseInt(st.nextToken());
//            boolean isFind = false;
//            int start = 0;
//            int end = A.length - 1;
//
//            while(start <= end) {
//                int mid = (start+end) / 2;
//                if(A[mid] > target) {
//                    end = mid - 1;
//                }
//                else if(A[mid] < target) {
//                    start = mid + 1;
//                }
//                else {
//                    System.out.println(1);
//                    isFind = true;
//                    break;
//                }
//            }
//            if(!isFind) {
//                System.out.println(0);
//            }
//        }
//    }
}