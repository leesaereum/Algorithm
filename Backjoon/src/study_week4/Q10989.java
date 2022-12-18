package study_week4;

import java.util.Scanner;

public class Q10989 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = s.nextInt();
        int[] arr = new int[10000];
            for (int i = 0; i < N; i++) {
            arr[s.nextInt()-1] ++;
        }

        for (int i = 0; i < arr.length; i++) {
            while (arr[i]>0){
                sb.append((i+1)+"\n");
                arr[i]--;
            }

        }
            System.out.println(sb);
    }
}
