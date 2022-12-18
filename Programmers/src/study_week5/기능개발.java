package study_week5;
import java.util.*;

public class 기능개발 {
    public static void main(String[] args) {
        int[] progresses = {1,1,1,1};
        int[] speeds = {100,50,99,100};
        ArrayList<Integer> answer = solution(progresses, speeds);
        System.out.println(answer);
    }
    public static ArrayList<Integer> solution(int[] progresses, int[] speeds){
        ArrayList<Integer> answer = new ArrayList<>();
        int count = 1;
        double tmp1 = Math.ceil((100 - (double)progresses[0]) / speeds[0]);
        for (int i = 1; i < progresses.length; i++) {
            double tmp2 = Math.ceil((100 - (double)progresses[i]) / speeds[i]);
            if (tmp1 >= tmp2) count++;
            else {
                answer.add(count);
                tmp1 = tmp2;
                count = 1;
            }
            if (i == progresses.length - 1) answer.add(count);
        }
        return answer;
    }
}