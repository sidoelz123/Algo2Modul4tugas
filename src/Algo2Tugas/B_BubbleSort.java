package Algo2Tugas;

public class B_BubbleSort {
    public static void bubbleSort(int[] A){
        int i=1, j, n= A.length;
        int temp;
        while (i<n){
            j = n-1;
            while(j>=i){
                if (A[j-1]>A[j]){
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j-1]=temp;
                }
                j=j-1;
            }
            i=i+1;
        }
    }
    public static void main(String[] args) {
        int[] B={25,7,9,13,3};
        System.out.println("\nB_BubbleSort");

        A_InsertionSort.Title();
        A_InsertionSort.PrintName();
        System.out.println("Data sebelum diurutkan : ");
        A_InsertionSort.tampil(B);
        B_BubbleSort.bubbleSort(B);
        System.out.println("\nData Setelah diurutkan :");
        A_InsertionSort.tampil(B);
    }
}
