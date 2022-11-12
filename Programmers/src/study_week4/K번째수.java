package study_week4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;

public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        ArrayList<Integer> result = solution(array,commands);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<commands.length;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=commands[i][0]-1;j<commands[i][1];j++){
                arr.add(array[j]);
            }
            arr.sort(Comparator.naturalOrder());
            result.add(arr.get(commands[i][2]-1));
        }
        return result;
    }
}