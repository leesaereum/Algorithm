package study_week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2751 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(s.nextInt());
        }
        Collections.sort(arr);
        for(int value : arr) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
