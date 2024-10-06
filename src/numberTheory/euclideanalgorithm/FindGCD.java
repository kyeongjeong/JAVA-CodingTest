package numberTheory.euclideanalgorithm;

import java.util.*;
import java.io.*;

public class FindGCD {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long result = gcd(A, B);
        while(result > 0) {
            bw.write("1");
            result--;
        }
        bw.flush();
        bw.close();  // BufferedWriter 닫기 추가
    }

    public static long gcd(long A, long B) {
        if(B == 0) {
            return A;
        }
        else {
            return gcd(B, A % B);
        }
    }
}
