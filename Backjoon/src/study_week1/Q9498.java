package study_week1;

import java.util.Scanner;

public class Q9498 {
    public static void main(String[] args) {
        String r="";
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();

        switch(A/10){
            case 9,10 : r = "A";
                break;
            case 8: r= "B";
                break;
            case 7: r="C";
                break;
            case 6: r="D";
                break;
            default: r="F";
                break;
        }
        System.out.print(r);
    }
}
