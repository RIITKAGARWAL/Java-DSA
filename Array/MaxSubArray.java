public class MaxSubArray{
    static int arr[] = {5,4,-1,7,8};
    //brute force algorithm
    static int maxSum(int arr[]){
        int max= 0;
        int currSum = 0;

        for(int i=0;i<arr.length;i++){
            currSum=0;
            for(int j= i; j<arr.length;j++){
                currSum+=arr[j];
                if(max<currSum){
                    max = currSum;
                }
            }
        }
        return max;
    }

    //via kaden's algorithm
    static int maxSumKaden(int arr[]){
        int max= 0;
        int currSum = 0;
        
        for(int ctr=0;ctr<arr.length;ctr++){
            if(currSum<0){
                currSum=0;
            }
            currSum +=arr[ctr];
            if(max<currSum){
                max = currSum;
            }
        }
        return max;
    }
    public static void main(String args[]){
        System.out.println(maxSum(arr));
        System.out.println(maxSumKaden(arr));
    }
}