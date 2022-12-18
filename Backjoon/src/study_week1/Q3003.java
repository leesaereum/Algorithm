package study_week1;

import java.util.Scanner;

public class Q3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,1,2,2,2,8};
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            sb.append(arr[i]-scanner.nextInt()+" ");
        }
        System.out.println(sb);
    }
}
