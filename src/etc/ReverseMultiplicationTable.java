package etc;
import java.util.*;
import java.io.*;

public class ReverseMultiplicationTable {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int max = 0;
        for(int i = 1; i <= K; i++) {

            int num = N * i;
            String str = String.valueOf(num);
            int reverse = Integer.parseInt(new StringBuilder(str).reverse().toString());
            max = Math.max(max, reverse);
        }
        System.out.println(max);
    }
}