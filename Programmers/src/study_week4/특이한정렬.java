package study_week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 특이한정렬 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array2 = {10000,20,36,47,40,6,10,7000};
        ArrayList<Integer> result = solution(array,4);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        System.out.println("----------------");
        result = solution(array2,30);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static ArrayList<Integer> solution(int[] array, int num) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
        }

        Comparator c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1-num)==Math.abs(o2-num))
                    return o2 - o1;
                else
                    return Math.abs(o1-num) - Math.abs(o2-num);
            }
        };

        Collections.sort(result,c);
        return result;
    }

}
