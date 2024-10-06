package numberTheory.euclideanalgorithm;
import java.util.*;
import java.io.*;

public class LCMCalculator {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(bf.readLine());
//
//        StringTokenizer st;
//        for(int i = 0; i < T; i++) {
//            st = new StringTokenizer(bf.readLine());
//            int num1 = Integer.parseInt(st.nextToken());
//            int num2 = Integer.parseInt(st.nextToken());
//
//            int result = (num1 * num2) / gcd(num1, num2);
//            System.out.println(result);
//        }
//    }

    public static int gcd(int num1, int num2) {
        if(num2 == 0) {
            return num1;
        }
        else {
            return gcd(num2, num1 % num2);
        }
    }
}