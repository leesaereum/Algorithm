package study_week1;

import java.util.Scanner;

public class Q2480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int F = s.nextInt();
        int S = s.nextInt();
        int T = s.nextInt();
        int P = 0;

        if(F==S&&F==T) P=10000+1000*F;
        else{
            if(F==S||F==T) P=1000+100*F;
            else if(S==T) P=1000+100*S;
            else P=100*Math.max(Math.max(F,S),T);
        }

        System.out.print(P);
    }
}
