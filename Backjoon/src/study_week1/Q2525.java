package study_week1;

import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int H = s.nextInt();
        int M = s.nextInt()+s.nextInt();

        while(M>=60){
            M-=60;
            H++;
        }
        if(H>=24) H-=24;

        System.out.print(H+" "+M);
    }
}
