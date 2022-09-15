package study_week1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        System.out.print(soultion(a));
    }

    public static long soultion(long a) {
        String[] str = Long.toString(a).split("");
        String str2 = "";
        Arrays.sort(str, Comparator.reverseOrder());
        for(int i=0;i<str.length;i++) {
            str2 += str[i];
        }
        long answer= Long.parseLong(str2);
        return answer;
    }
}
