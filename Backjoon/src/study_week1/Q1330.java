package study_week1;

import java.util.Scanner;

public class Q1330 {
    public static void main(String[] args) {
        String r="";
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();

        if(A>B) r=">";
        else if(A<B) r="<";
        else r="==";
        System.out.print(r);
    }
}
