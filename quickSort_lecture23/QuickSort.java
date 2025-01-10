package quickSort_lecture23;

public class QuickSort {
    int findPivot(int[] arr, int low,int high){
        int pivotVal = arr[high];
        int ctr=-1; // this will in the end, hold pivot index
        int idx1 = low;

        while(!(high<idx1)){
            if(arr[idx1]<= pivotVal){
                ctr++;
                //swap
                int temp = arr[idx1];
                arr[idx1] = arr[ctr];
                arr[ctr] = temp;

            }
            idx1++;
        }
        return ctr;


    }
    void QkSort(int[] arr, int low,int high){
    int pivotIdx = findPivot(arr,  low,high);
        QkSort(arr, low,pivotIdx-1);
        QkSort(arr, pivotIdx+1,high);
    }
}
