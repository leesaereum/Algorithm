package study_week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q2108 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        int[] range = new int[8001];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
            range[arr[i]+4000] ++;
        }
        Arrays.sort(arr);
        ArrayList<Integer> max = new ArrayList<Integer>();
        int count = 0;
        boolean ok = true;
        for (int i = 0; i < 8001; i++) {
            if(range[i]>count){
                max.clear();
                count = range[i];
                max.add(i-4000);
                ok = true;
            }else if(range[i]==count){
                max.add(i-4000);
                ok = false;
            }
        }

        System.out.println(Math.round(sum / N));
        System.out.println(arr[N/2]);
        System.out.println(ok?max.get(0):max.size()==2?max.get(0):max.get(1));
        System.out.println(arr[N-1]-arr[0]);
    }
}
