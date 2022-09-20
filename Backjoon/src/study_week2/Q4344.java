package study_week2;

import java.util.Scanner;

public class Q4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        for(int i=0;i<N1;i++) {
            int N2 = scanner.nextInt();
            double avg = 0;
            double count = 0;
            int[] score = new int[N2];
            for(int j=0;j<N2;j++){
                score[j] = scanner.nextInt();
                avg +=score[j];
            }
            avg=avg/N2;
            for(int j=0;j<N2;j++){
                if(score[j]>avg) count++;
            }
            count = count/N2*100;
            System.out.print(String.format("%.3f",count)+"%\n");
        }
    }
}
