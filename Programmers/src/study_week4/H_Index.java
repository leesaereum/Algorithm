package study_week4;

import java.util.Arrays;

public class H_Index {
    public static void main(String[] args) {
        int[] array = {2, 0, 3, 1, 4, 6};
        System.out.println(solution(array));
    }
    public static int solution(int[] array) {
        int result = 0;
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            int h = array[i];
            //h번 이상 인용된것
            int up = array.length - i;
            if(h>=up){
                result = up;
                break;
            }
        }
        return result;
    }
}
