package study_week1;

import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            int Num1 = s.nextInt();
            int Num2 = s.nextInt();
            if(Num2==0&&Num1==0) break;
            System.out.println(Num1+Num2);
        }

    }
}
