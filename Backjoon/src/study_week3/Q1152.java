package study_week3;

import java.util.Scanner;

public class Q1152 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] str = s.nextLine().trim().split(" ");
        if(str[0]=="") System.out.print(0);
        else System.out.print(str.length);
    }
}
