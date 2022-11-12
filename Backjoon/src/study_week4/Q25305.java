package study_week4;

import java.util.Arrays;
import java.util.Scanner;

public class Q25305 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        int N2 = s.nextInt();
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[N-N2]);
    }
}
