package study_week2;

import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[9];
        int value = 0;
        int index = 0;
        for(int i=0;i<9;i++){
            array[i] = s.nextInt();
            if(value<array[i]){
                value = array[i];
                index = i;
            }

        }
        System.out.print(value+"\n"+(index+1));
    }
}