package study_week1;

import java.util.Scanner;

public class Q10807 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        int find = s.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if(find == arr[i]) count ++;
        }
        System.out.println(count);
    }
}
