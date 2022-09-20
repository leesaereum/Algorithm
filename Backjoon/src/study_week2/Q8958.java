package study_week2;

import java.util.Scanner;

public class Q8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=0;i<N;i++) {
            String str = scanner.next();
            int score = 0;
            int count = 0;
            String[] sta = str.split("");
            for(int j=0;j<sta.length;j++){
                if(sta[j].equals("O")){
                    count ++;
                    score += count;
                }else{
                    count = 0;
                }
            }
            System.out.println(score);
        }
    }
}