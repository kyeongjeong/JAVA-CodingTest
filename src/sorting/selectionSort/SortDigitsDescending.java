package sorting.selectionSort;
import java.util.*;
import java.io.*;

public class SortDigitsDescending {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] str = bf.readLine().toCharArray();
        int[] arr = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            arr[i] = str[i] - '0';
        }

        for(int i = 0; i < arr.length-1; i++) {
            int max = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[max]) {
                    max = j;
                }
            }
            if(arr[i] < arr[max]) {
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }

        for(int i = 0; i < str.length; i++) {
            System.out.print(arr[i]);
        }
    }
}