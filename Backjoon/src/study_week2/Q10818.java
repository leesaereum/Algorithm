package study_week2;

import java.util.Scanner;
import java.util.Arrays;
public class Q10818 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] array = new int[N];
        for(int i=0;i<N;i++){
            array[i] = s.nextInt();
        }
        Arrays.sort(array);
        System.out.print(array[0]+" "+array[N-1]);
    }
}
