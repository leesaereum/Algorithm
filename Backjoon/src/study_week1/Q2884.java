package study_week1;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        int r=1;
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();

        if(A>0){
            if(B<0) r=4;
        }else{
            if(B>0) r=2;
            else r=3;
        }

        System.out.print(r);
    }
}
