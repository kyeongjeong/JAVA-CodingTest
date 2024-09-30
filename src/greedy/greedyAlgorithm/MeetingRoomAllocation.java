package greedy.greedyAlgorithm;
import java.util.*;
import java.io.*;

public class MeetingRoomAllocation {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[][] A = new int[N][2];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            A[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            A[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간
        }

        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] S, int[] E) {
                if(S[1] == E[1]) {
                    return S[0] - E[0];  // 종료 시간이 같으면 시작 시간으로 정렬
                }
                return S[1] - E[1];  // 종료 시간 기준 정렬
            }
        });

        int count = 0;
        int end = 0;
        for(int i = 0; i < N; i++) {
            if(A[i][0] >= end) {  // 시작 시간이 이전 종료 시간 이후면 회의실 사용 가능
                end = A[i][1];
                ++count;
            }
        }
        System.out.println(count);
    }
}
