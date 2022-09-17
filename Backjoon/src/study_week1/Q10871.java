package study_week1;

import java.util.Scanner;

public class Q10871 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int Num = s.nextInt();
        for(int i=1;i<=N;i++){
            int A = s.nextInt();
            if(A<Num) System.out.println(A);
        }
    }
}
