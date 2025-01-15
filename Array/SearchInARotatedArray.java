public class SearchInARotatedArray {

    //using Binary Search O(log n)
    public int forsearch(int[] nums, int target) {
    int mid;
    int firstIdx = 0;
    int lastIdx = nums.length -1;
    while(firstIdx<=lastIdx){
        mid = (firstIdx+lastIdx)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            firstIdx=mid+1;
        }
        else{
            lastIdx =mid-1;
        }

    }
    return -1;
    }

    //since each element is travesed once : O(n)
    public int search(int[] nums, int target) {
        int idx1 = 0;
        int n = nums.length;
        int count = 0; // To keep track of the number of iterations

        while (true) {
            if (nums[idx1] == target) {
                return idx1;
            }
            // Break the loop if we've gone through the entire array
            if (count >= n) {
                return -1;
            }
            // Point of rotation: break;
            if (nums[idx1] > nums[(idx1 + 1) % n]) {
                return -1;
            }
            if (nums[idx1] < target) {
                if (nums[(idx1 + 1) % n] == target) {
                    return (idx1 + 1) % n;
                } else {
                    idx1 = (idx1 + 2) % n;
                }
            } else {
                if (nums[((idx1 - 1) + n) % n] == target) {
                    return ((idx1 - 1) + n) % n;
                } else {
                    idx1 = ((idx1 - 2) + n) % n;
                }
            }
            count++; // Increment the count after each iteration
        }
    }

    // second way
    // linear approach O(n)
    int research(int nums[], int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                return count;
            }
            count++;
        }
        return -1;
    }

    public static void main(String args[]) {

    }
}
