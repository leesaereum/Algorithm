package study_week1;

import java.util.Scanner;

public class Q2739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for(int i=1;i<10;i++){
            System.out.println(N+" * "+i+" = "+(i*N));
        }
    }
}
