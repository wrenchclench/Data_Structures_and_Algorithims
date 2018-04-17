package SortingAlgorithims;

public class InsertionSort {

    public void insertionSort(int array[]){
        for (int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i -1;

            while( j>=0 && array[j] > key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        int array[] = {675687, 111, 139934, 566, 9823, 776654, 45};

        InsertionSort ob = new InsertionSort();
        ob.insertionSort(array);

        System.out.println("Insertion Sort");
        printArray(array);
    }
}

