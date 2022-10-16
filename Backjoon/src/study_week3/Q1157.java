package study_week3;

import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next().toUpperCase();
        int []Array = new int [26];

        for(int i=0;i<str.length();i++) {
            for(int j = 0; j<26; j++ ) {
                if(j==str.charAt(i)-65) Array[j]++;
            }
        }

        int Max = 0 ;
        char c = '?';
        for(int i=0;i<26;i++) {
            if(Max<Array[i]) {
                Max = Array[i];
                c = (char)(i+65);
            }else if(Max==Array[i])c = '?';
        }
        System.out.println(c);
    }
}
