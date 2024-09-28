package sorting.insertionSort;
import java.util.*;
import java.io.*;

public class CalculateATMWithdrawalTime {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(bf.readLine());
//
//        int arr[] = new int[N];
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        for(int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        for(int i = 1; i < N; i++) {
//            int point = 0;
//            int temp = arr[i];
//            for(int j = i-1; j >= 0; j--) {
//                if(arr[j] < arr[i]) {
//                    point = j+1;
//                    break;
//                }
//                if(j == 0) {
//                    point = 0;
//                }
//            }
//            for(int j = i; j > point; j--) {
//                arr[j] = arr[j-1];
//            }
//            arr[point] = temp;
//        }
//
//        int[] S = new int[N];
//        S[0] = arr[0];
//        for(int i = 1; i < N; i++) {
//            S[i] = S[i-1] + arr[i];
//        }
//
//        int total = 0;
//        for(int i = 0; i < N; i++) {
//            total = total + S[i];
//        }
//
//        System.out.print(total);
//    }
}