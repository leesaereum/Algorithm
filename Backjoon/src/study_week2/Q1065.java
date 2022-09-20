package study_week2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(hansu(scanner.nextInt()));
    }
    public static int hansu(int N){
        int count = 0;
        if(N<=99) count = N;
        else{
            count = 99;
            for(int i=100;i<=N;i++){
                if(i/100-(i/10)%10==(i/10)%10-i%10) count++;
            }
        }
        return count;
    }
}