import java.util.HashSet;

public class TwoRepeatedElements {
    // Function to find two repeated elements.
    public int[] twoRepeated(int n, int arr[]) {
        int[] newArr =new int[2];
        // Your code here
        HashSet <Integer> set =new HashSet<>();
        int idx = -1;
        int i =0;
        while(++idx<n+2){
            if(!set.contains(arr[idx])){
                set.add(arr[idx]);
            }
            else{
                newArr[i++]= arr[idx];
            }
        }
        return newArr;
    }
}