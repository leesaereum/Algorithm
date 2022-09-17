package study_week1;

import java.util.Scanner;

public class Q1110 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Num1 = s.nextInt();
        int Num2 = 0;
        int count = 0;
        if(Num1==0) count=1;
        while(Num1!=Num2){
            if(count==0) Num2 = Num1;
            count ++;
            int Num3 = Num2/10 + Num2%10;
            if(Num3>=10) Num3-=10;
            Num2 = (Num2%10)*10+Num3;

        }
        System.out.print(count);

    }
}
