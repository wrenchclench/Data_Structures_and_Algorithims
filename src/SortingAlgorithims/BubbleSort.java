package SortingAlgorithims;

public class BubbleSort {

    public void myBubbleSort(int array[]){

        //Iterate through the array beginning at the last index
        for (int i = 0; i < array.length - 1; i++){
            //Iterate through the array to the index to the left of i
            for (int j = 0; j <array.length - i - 1; j++){
                //Check if the value of the index on the left is less than the index on the right
                if (array[j] > array[j+1]){
                    //If so, swap them.
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
            }
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int array[] = {64, 15000, 111, 654, 9965, 45, 2000};
        ob.myBubbleSort(array);
        System.out.println("Array Sorted Via Bubble Sort");
        ob.printArray(array);
    }
}

