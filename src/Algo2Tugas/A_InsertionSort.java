package Algo2Tugas;

public class A_InsertionSort {
    public static void Title() {
        String myHeader;
        myHeader = "==============================" +
                "\nAlgoritma dan Struktur Data 2\n" +
                "==============================";
        System.out.println(myHeader);
    }
    public  static void PrintName(){
        String Name = "Ihza Maulana Zakiya";
        int NIM = 20090049;
        System.out.println("Nama : " + Name + "\nNIM : " +NIM+ "\n");

    }

    public static void InsertionSort(int[] A) {
        for (int i = 1; i<A.length; i++ ) {
            int key = A[i];
            int j = i -1;
            while ((j >= 0) && (A[j] > key )) {

                A[j+1] = A[j];
                j--;
            }
            A[j+1]=key;
        }

    }

    public static void tampil(int [] data) {
        for (int i=0; i< data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("\n");

    }


    public static void main(String[] args) {
        int[] A = {25,7,9,13,3};
        System.out.println("\nA_Insertion Sort");
	    A_InsertionSort.Title();
	    A_InsertionSort.PrintName();
        System.out.println("Data sebelum diurutkan : ");
        A_InsertionSort.tampil(A);
        A_InsertionSort.InsertionSort(A);
        System.out.println("\nData Setelah diurutkan :");
        A_InsertionSort.tampil(A);



    }
}
