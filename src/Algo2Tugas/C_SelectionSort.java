package Algo2Tugas;

public class C_SelectionSort {
    public static void selectionSort(int[] A){
        int smallIndex;
        int pass, j, n=A.length;
        int temp;

        for (pass=0; pass<n-1;pass++){
            smallIndex=pass;
            for (j=pass+1; j<n; j++){
                if (A[j]<A[smallIndex]){
                    smallIndex=j;
                }
            }
            temp = A[pass];
            A[pass]=A[smallIndex];
            A[smallIndex]=temp;
        }
    }


    public static void main(String[] args) {
        int[] C ={25,7,9,13,3};
        System.out.println("\nC_SelectionSort");

        A_InsertionSort.Title();
        A_InsertionSort.PrintName();
        System.out.println("Data sebelum diurutkan : ");
        A_InsertionSort.tampil(C);
        C_SelectionSort.selectionSort(C);
        System.out.println("\nData Setelah diurutkan :");
        A_InsertionSort.tampil(C);

    }

}
