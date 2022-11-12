package study_week4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q11651 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = s.nextInt();
            arr[i][1] = s.nextInt();
        }
        Comparator<int[]> c = new Comparator<int[]>() {
            public int compare(int[] a1, int[] a2) {
                if(a1[1] == a2[1])
                    return a1[0] - a2[0];
                else
                    return a1[1] - a2[1];
            }
        };
        Arrays.sort(arr,c);
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
