package ShellSort;

public class Q7 {
    static void shellSort(int[] a){
        for(int h = a.length/2; h>0; h/=2) {
            System.out.println("h-정렬:"+h);
            System.out.print("   실행 전 :");
            for (int l = 0; l < a.length; l++) System.out.print("   "+a[l]);
            System.out.println();
            for (int i = h; i < a.length; i++) {
            int j;
            int tmp = a[i];
            for (j=i-h; j>=0&&a[j]>tmp; j-=h) {
                a[j+h] = a[j];
            }
            a[j+h] = tmp;
            }
            System.out.print("   실행 후 :");
            for (int l = 0; l < a.length; l++) System.out.print("   "+a[l]);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] a = {8,1,4,2,7,6,3,5};
        shellSort(a);
    }
}