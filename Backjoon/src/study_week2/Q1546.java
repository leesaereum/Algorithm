package study_week2;

import java.util.Scanner;
import java.util.Arrays;

public class Q1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] Array = new int[N];
        double avg =0;
        for(int i=0;i<N;i++) {
            Array[i]=scanner.nextInt();
        }
        Arrays.sort(Array);

        for(int i=0;i<N;i++) {
            avg+=Array[i]/Array[N-1]*100;
        }
        System.out.println(avg/N);
    }
}