package greedy.greedyAlgorithm;
import java.util.*;
import java.io.*;

public class FindMinimumCoins {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long[] coins = new long[N];
        for(int i = 0; i < N; i++) {
            coins[i] = Long.parseLong(bf.readLine());
        }

        long total = 0;
        long remains = K;
        for (int i = N - 1; i >= 0; i--) {
            if (remains >= coins[i]) {
                long temp = remains / coins[i];
                remains -= temp * coins[i];
                total += temp;
            }
        }
        System.out.print(total);
    }
}