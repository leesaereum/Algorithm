package study_week2;

import java.util.ArrayList;

public class Q4673 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for(int i=1;i<=10000;i++){
            int Num1 = i;
            int Num2 = Num1;
            while(Num2>0){
                Num1+=Num2%10;
                Num2/=10;
            }
            list.add(Num1);
        }
        for(int i=1;i<=10000;i++){
            if(!list.contains(i)) System.out.println(i);
        }
    }
}
