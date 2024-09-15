package dataStructures.slidingWindow;
import java.util.*;
import java.io.*;

public class DNAPassword {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//
//        int S = Integer.parseInt(st.nextToken());  // 전체 문자열 길이
//        int P = Integer.parseInt(st.nextToken());  // 패턴 길이
//        char[] str = bf.readLine().toCharArray();  // DNA 문자열
//
//        int[] minAGCT = new int[4];  // 주어진 A, C, G, T 최소 개수 조건
//        int[] currentAGCT = new int[4];  // 현재 슬라이딩 윈도우에서 A, C, G, T 개수
//
//        st = new StringTokenizer(bf.readLine());
//        for (int i = 0; i < 4; i++) {
//            minAGCT[i] = Integer.parseInt(st.nextToken());
//        }
//
//        // 초기 윈도우 설정: 첫 P개의 문자를 세팅
//        for (int i = 0; i < P; i++) {
//            addChar(currentAGCT, str[i]);
//        }
//
//        int result = 0;
//
//        // 첫 번째 윈도우에 대해 조건 확인
//        if (isValidPassword(currentAGCT, minAGCT)) {
//            result++;
//        }
//
//        // 슬라이딩 윈도우 시작
//        for (int i = P; i < S; i++) {
//            // 새로운 문자 추가하고, 윈도우의 첫 번째 문자 제거
//            addChar(currentAGCT, str[i]);
//            removeChar(currentAGCT, str[i - P]);
//
//            // 조건이 만족되면 결과 증가
//            if (isValidPassword(currentAGCT, minAGCT)) {
//                result++;
//            }
//        }
//        System.out.println(result);
//    }
//
//    // 현재 문자 배열에서 AGCT 값을 추가하는 메서드
//    private static void addChar(int[] currentAGCT, char ch) {
//        switch (ch) {
//            case 'A': currentAGCT[0]++; break;
//            case 'C': currentAGCT[1]++; break;
//            case 'G': currentAGCT[2]++; break;
//            case 'T': currentAGCT[3]++; break;
//        }
//    }
//
//    // 현재 문자 배열에서 AGCT 값을 제거하는 메서드
//    private static void removeChar(int[] currentAGCT, char ch) {
//        switch (ch) {
//            case 'A': currentAGCT[0]--; break;
//            case 'C': currentAGCT[1]--; break;
//            case 'G': currentAGCT[2]--; break;
//            case 'T': currentAGCT[3]--; break;
//        }
//    }
//
//    // 현재 윈도우가 주어진 AGCT 조건을 만족하는지 확인하는 메서드
//    private static boolean isValidPassword(int[] currentAGCT, int[] minAGCT) {
//        for (int i = 0; i < 4; i++) {
//            if (currentAGCT[i] < minAGCT[i]) {
//                return false;
//            }
//        }
//        return true;
//    }
}
