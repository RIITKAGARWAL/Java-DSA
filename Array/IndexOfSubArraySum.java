import java.util.ArrayList;

public class IndexOfSubArraySum {
    
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> tempArr = new ArrayList<>();
        int sum = 0;
        int firstPtr = 0;
        int lastPtr = 0;

        while (lastPtr <= arr.length) {
            if (sum == target) {
                tempArr.add(firstPtr + 1);
                tempArr.add(lastPtr);
                return tempArr;
            }
            if (sum > target && firstPtr < lastPtr) {
                sum -= arr[firstPtr];
                firstPtr++;
            } else if (lastPtr < arr.length) {
                sum += arr[lastPtr];
                lastPtr++;
            } else {
                break;
            }
        }

        tempArr.add(-1);
        return tempArr;
    }
}

