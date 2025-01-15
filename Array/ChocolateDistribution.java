public class ChocolateDistribution {

    public static void main(String args[]) {
        int arr[] = { 43, 52, 13, 2, 34, 54, 32 };
        int children = 3;
        int index = 0;
        int minDifference = Integer.MAX_VALUE;
        // sort the array
        while (index < arr.length) {
            for (int ctr = 0; ctr < arr.length; ctr++) {
                if (arr[ctr] > arr[index]) {
                    // swap
                    arr[index] += arr[ctr];
                    arr[ctr] = arr[index] - arr[ctr];
                    arr[index] = arr[index] - arr[ctr];
                }
            }
            index++;
        }
        //display sorted array
        for(int num:arr){
            System.out.println(num);
        }
        // sliding window
        for (int idx = 0; idx <= arr.length - children; idx++) {
            minDifference = Math.min(arr[idx + children - 1] - arr[idx], minDifference);
        }

        //display output
        System.err.println("Minimum output is : "+minDifference);
    }
}
