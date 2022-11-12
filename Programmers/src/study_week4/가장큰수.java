package study_week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 가장큰수 {
    public static void main(String[] args) {
        int[] array1 = {6, 10, 2};
        int[] array2 = {3, 30, 34, 5, 9};
        System.out.println(solution(array1));
        System.out.println(solution(array2));
    }
    public static String solution(int[] array) {
        String result = "";
        ArrayList<String> arr = new ArrayList<>();
        for (int i : array) {
            arr.add(Integer.toString(i));
        }

        Comparator<String> c =  new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer a1 = Integer.parseInt(o1+o2);
                Integer a2 = Integer.parseInt(o2+o1);
                if(a1>a2) return -1;
                else return 1;
            }
        };
        Collections.sort(arr,c);
        for (int i = 0; i < arr.size(); i++) {
            result += arr.get(i);
        }
        return result;
    }
}
