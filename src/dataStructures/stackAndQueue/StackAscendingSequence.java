package dataStructures.stackAndQueue;

import java.util.*;
import java.io.*;

public class StackAscendingSequence {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(bf.readLine());
//
//        Stack<Integer> stack = new Stack<>();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(bf.readLine());
//        }
//
//        StringBuffer result = new StringBuffer();
//        int num = 1;
//        for(int i = 0; i < n; i++) {
//            if(arr[i] >= num) {
//                while(arr[i] >= num) {
//                    stack.push(num++);
//                    result.append("+\n");
//                }
//                stack.pop();
//                result.append("-\n");
//            }
//            else {
//                if(stack.peek() > arr[i]) {
//                    System.out.print("NO");
//                    return;
//                }
//                else {
//                    stack.pop();
//                    result.append("-\n");
//                }
//            }
//        }
//        System.out.print(result);
//    }
}
