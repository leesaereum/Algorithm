package study_week5;
import java.util.*;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        ArrayList<Integer> answer = solution(arr);
        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> num = new ArrayList<>();
        int list_length = 0;
        for(int i=0;i<arr.length;i++) {
            if (i == 0) num.add(arr[i]);
            else {
                if (num.get(list_length) != arr[i]) {
                    num.add(arr[i]);
                    list_length++;
                }
            }
        }
            return num;
        }
}

