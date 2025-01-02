package mergeSort_lecture22;

public class MergeSort {

    // divide method
    public void divide(int[] arr, int strtIdx, int lastIdx) {
        // base condition
        if (lastIdx < strtIdx) {
            return;
        }

        // find mid index
        int midIdx = strtIdx + (lastIdx - strtIdx) / 2;

        // recursion call
        divide(arr, strtIdx, midIdx); // upto half part
        divide(arr, midIdx + 1, lastIdx); // the other half part
    }

    // conquer method
    public void conquer(int[] arr, int strtIdx, int lastIdx) {
        int[] newArr = new int[lastIdx - strtIdx +1];
        // find mid index
        int midIdx = strtIdx + (lastIdx - strtIdx) / 2;

        int idx1 = strtIdx;
        int idx2 = midIdx + 1;
        int newArrIdx = 0;
        while ((idx1 <= midIdx) && (idx2 <= lastIdx)) {

            if (arr[idx1] < arr[idx2]) {
                newArr[newArrIdx++] = arr[idx1++]; //less value will be assigned into new Array
            } else {
                newArr[newArrIdx++] = arr[idx2++];
            }

        }

        //loop for idx1 side remaining materials
        while(idx1<= midIdx){
            newArr[newArrIdx++] = arr[idx1++]; //less value will be assigned into new Array
        }

        //loop for idx2 side remaining materials
        while(idx2<= lastIdx){
            newArr[newArrIdx++] = arr[idx2++]; //less value will be assigned into new Array
        }

        //now everything is sorted and could be placed in original array
        for(int idx=0,ctr=strtIdx;idx<newArr.length;idx++){
            arr[ctr++]=newArr[idx];
        }
    }
}
