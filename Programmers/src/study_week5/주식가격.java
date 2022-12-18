package study_week5;

import java.util.ArrayList;

public class 주식가격 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        int[] answer = solution(prices);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        answer[prices.length-1] = 0;
        for(int i=0;i<=prices.length-2;i++){
            int count = 0;
            for(int j=i+1;j<=prices.length-1;j++){
                if(prices[j]>=prices[i]) count++;
                else{
                    count ++;
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
