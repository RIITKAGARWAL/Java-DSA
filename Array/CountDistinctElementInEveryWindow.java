import java.util.ArrayList;
import java.util.HashSet;

public class CountDistinctElementInEveryWindow {

        ArrayList<Integer> countDistinct(int arr[], int k) {
            // code here
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int i=0;i<=arr.length-k;i++){
            HashSet<Integer> tempArr = new HashSet<>();
                for(int j=0;j<k;j++){
                    tempArr.add(arr[i+j]);
                }
            temp.add(tempArr.size());
            }
            return temp;
        }
    }
    
    
