package study_week2;

import java.util.Scanner;

public class Q5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] result = new boolean[30];
        for (int i = 0; i < 28; i++) {
            result[scanner.nextInt()-1] = true;
        }
        int count = 0;
        for (int i = 0; i < 30; i++) {
            if(!result[i]){
                System.out.println(i+1);
                count++;
            }
            if(count==2) break;
        }
    }
}
