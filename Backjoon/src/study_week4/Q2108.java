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
        StringBuffer sb = new StringBuffer();
        double sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
            range[arr[i]+4000] ++;
        }
        Arrays.sort(arr);

        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        boolean ok = false;
        for (int i = 0; i < 8001; i++) {
            if(range[i]>count){
                al.clear();
                al.add(i-4000);
                count = range[i];
                ok = true;
            }else if(range[i]==count&&ok){
                al.add(i-4000);
                ok = false;
            }
        }

        int Num = 0;
        if(ok) Num=al.get(0);
        else Num = al.get(1);
        sb.append(Math.round(sum / N)+"\n");
        sb.append(arr[N/2]+"\n");
        sb.append(Num+"\n");
        sb.append(arr[N-1]-arr[0]);
        System.out.println(sb);
    }
}
