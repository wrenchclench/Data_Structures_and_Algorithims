package SortingAlgorithims;

public class SelectionSort {

    public void selectionSort(int array[]){

        for(int i = 0; i < array.length-1; i++){
            int lowest_number = i;
            for(int j= i+1; j < array.length; j++){
                if (array[j] < array[lowest_number]){
                    lowest_number = j;

                    int temp = array[lowest_number];
                    array[lowest_number] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

//    public static void main(String args[])
//    {
//        SelectionSort obj = new SelectionSort();
//        int array[] = {432,2115,112,8,78};
//        obj.selectionSort(array);
//        System.out.println("Sorted Array");
//        obj.printArray(array);
//    }
}
