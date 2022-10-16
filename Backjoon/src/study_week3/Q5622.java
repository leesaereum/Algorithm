package study_week3;

import java.util.Scanner;

public class Q5622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - 65;
            if (a >= 22) sum += 10;
            else if (a >= 19) sum += 9;
            else if (a >= 15) sum += 8;
            else if (a >= 12) sum += 7;
            else if (a >= 9) sum += 6;
            else if (a >= 6) sum += 5;
            else if (a >= 3) sum += 4;
            else if (a >= 0) sum += 3;
        }
        System.out.println(sum);
    }
}
