package StraightSelectionSort;

public class Q5 {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void selectionSort(int[] a){
        int n = 1;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i< a.length-1; i++) {
            System.out.println("패스"+n+":");
            int min = i;
            System.out.print("   실행 전 :");
            for (int l = 0; l < a.length; l++) System.out.print("   "+a[l]);
            System.out.println();
            for (int j = i + 1; j < a.length; j++) {
               if (a[j] < a[min])
                    min = j;
               swap(a, i, min);
               //System.out.println("   min : "+min);
            }
            System.out.print("   실행 후 :");
            for (int l = 0; l < a.length; l++) System.out.print("   "+a[l]);
            System.out.println();
            n++;
        }
    }
    public static void main(String[] args) {
        int[] a = {6,4,8,3,1,9,7};
        selectionSort(a);

    }
}
