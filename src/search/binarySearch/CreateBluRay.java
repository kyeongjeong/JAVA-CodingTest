package search.binarySearch;
import java.util.*;
import java.io.*;

public class CreateBluRay {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        int N = Integer.parseInt(st.nextToken());  // 레슨 수
//        int M = Integer.parseInt(st.nextToken());  // 블루레이 개수
//
//        int[] lesson = new int[N];
//        int start = 0, end = 0;
//        st = new StringTokenizer(bf.readLine());
//        for(int i = 0; i < N; i++) {
//            lesson[i] = Integer.parseInt(st.nextToken());
//            start = Math.max(start, lesson[i]);  // 블루레이의 최소 크기는 가장 긴 레슨
//            end += lesson[i];  // 블루레이의 최대 크기는 모든 레슨의 합
//        }
//
//        while(start <= end) {
//            int mid = (start + end) / 2;  // 블루레이 크기
//            int sum = 0;
//            int count = 0;  // 필요한 블루레이 개수
//
//            for(int i = 0; i < N; i++) {
//                if(sum + lesson[i] > mid) {
//                    // 현재 블루레이에 담을 수 없으면 새로운 블루레이를 시작
//                    count++;
//                    sum = 0;
//                }
//                sum += lesson[i];
//            }
//
//            // 마지막 블루레이 처리
//            if(sum > 0) {
//                count++;
//            }
//
//            // 블루레이의 개수가 너무 많으면 크기를 늘리고, 적으면 줄임
//            if(count > M) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//
//        // 최소 블루레이 크기 출력
//        System.out.println(start);
//    }
}
