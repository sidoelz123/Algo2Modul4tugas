package Algo2Tugas;

public class D_ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        int jarak, i, j;
        boolean Sudah;
        int temp;
        jarak = n;

        while (jarak >=1 ){
            jarak = jarak /2;
            Sudah = true;
            while(Sudah){
                Sudah = false;
                for(j=0; j<n-jarak; j++){
                    i=j+jarak;
                    if (arr[j]>arr[i]){
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        Sudah = true;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] D = {25,7,9,13,3};
        System.out.println("\nD_ShellSort");

        A_InsertionSort.Title();
        A_InsertionSort.PrintName();
        System.out.println("Data sebelum diurutkan : ");
        A_InsertionSort.tampil(D);
        D_ShellSort.shellSort(D);
        System.out.println("\nData Setelah diurutkan :");
        A_InsertionSort.tampil(D);
    }
}
