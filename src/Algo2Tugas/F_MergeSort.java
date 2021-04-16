package Algo2Tugas;

public class F_MergeSort {
    private final int [] array;
    private final int [] tempMergArr;

    public F_MergeSort(int[] array){
        this.array = array;
        int length = array.length;
        this.tempMergArr = new int[length];
    }
    public void mergeSort(int lowerIndex, int higherIndex){
        if (lowerIndex < higherIndex){
            int middle = lowerIndex + (higherIndex - lowerIndex) /2;
            //below step sorts the left side of the array
            mergeSort(lowerIndex, middle);
            //below step sorts the right side of the array
            mergeSort(middle + 1, higherIndex);
            //now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
    private void mergeParts(int lowerIndex, int middle, int higherIndex){
        if (higherIndex + 1 - lowerIndex >= 0)
            System.arraycopy(array, lowerIndex, tempMergArr, lowerIndex, higherIndex + 1 - lowerIndex);
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i<=middle && j <= higherIndex){
            if (tempMergArr[i] <= tempMergArr[j]){
                array[k] = tempMergArr[i];
                i++;
            }
            else {
                array[k] = tempMergArr[j];
                j++;
            } k++;
        }
        while (i <= middle){
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
    }
    public void tampil() {
         for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

    }

    public static void main(String[] args) {
        int[] inputArr = {25, 7, 9, 13, 3};
        System.out.println("\nF_MergeSort");

        A_InsertionSort.Title();
        A_InsertionSort.PrintName();
        System.out.println("Data sebelum diurutkan : ");
        F_MergeSort mms = new F_MergeSort(inputArr);
        mms.tampil();
        mms.mergeSort(0,inputArr.length-1);
        System.out.println("\nData Setelah diurutkan :");
        mms.tampil();
    }

}
