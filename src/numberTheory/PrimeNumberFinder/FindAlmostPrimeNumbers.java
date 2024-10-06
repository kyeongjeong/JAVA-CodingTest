package numberTheory.PrimeNumberFinder;
import java.util.*;
import java.io.*;

public class FindAlmostPrimeNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        int limit = (int)Math.sqrt(B);
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        long count = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                long primePower = (long) i * i;
                while (primePower <= B) {
                    if (primePower >= A) {
                        count++;
                    }
                    if (primePower > B / i) {  // 범위를 넘어가는 것을 방지
                        break;
                    }
                    primePower *= i;
                }
            }
        }
        System.out.print(count);
    }
}