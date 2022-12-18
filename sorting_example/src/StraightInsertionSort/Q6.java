package StraightInsertionSort;

public class Q6 {
    static void insertionSort(int[] a){
        int n = 1;
        int count1 = 0;
        int count2 = 0;
        for(int i = 1; i< a.length; i++) {
            System.out.println("패스"+n+":");
            int j;
            int tmp = a[i];
            System.out.print("   실행 전 :");
            for (int l = 0; l < a.length; l++) System.out.print("   "+a[l]);
            System.out.println();
            for (j=i; j>0&&a[j-1]>tmp; j--) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
            System.out.print("   실행 후 :");
            for (int l = 0; l < a.length; l++) System.out.print("   "+a[l]);
            System.out.println();
            n++;
        }
    }
    public static void main(String[] args) {
        int[] a = {6,4,1,7,3,9,8};
        insertionSort(a);
    }
}

