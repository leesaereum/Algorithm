package study_week1;

import java.util.Scanner;

public class Q2439 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=N;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
