package study_week2;

import java.util.Scanner;

public class 제일작은수제거하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int[] answer = solution(arr);
        System.out.print(answer);
    }
        public static int[] solution(int[] arr) {
            if(arr.length==1||arr.length==0){
                int[] answer = {-1};
                return answer;
            }else{
                int min = arr[0];
                int index = 0;
                int[] answer = new int[arr.length-1];
                for(int i=0;i<arr.length;i++){
                    if(arr[i]<min){
                        min = arr[i];
                        index = i;
                    }
                }
                for(int i=0;i<arr.length;i++){
                    if(i<index)
                        answer[i] = arr[i];
                    else if(i!=index)
                        answer[i-1] = arr[i];
                }
                return answer;
            }
        }
}
