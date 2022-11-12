package study_week4;

import java.util.Arrays;
import java.util.Scanner;

public class Q1427 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] str = s.next().split("");
        String result = "";
        Arrays.sort(str);

        for (int i = str.length-1; i >=0 ; i--) {
            result += str[i];
        }
        System.out.print(result);
    }
}
