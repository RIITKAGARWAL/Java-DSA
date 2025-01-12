public class MaxSubArray{
    static int arr[] = {5,4,-1,7,8};

    //check if all elements in the array is negative
    static boolean isNegative(int arr[]){
        for(int num:arr){
            if(num>0){
                return false;
            }
        }
        return true;
    }
    //brute force algorithm
    static int maxSum(int arr[]){
        int max= Integer.MIN_VALUE;
        int currSum = 0;

                //check if all elements in the array is negative
                if(isNegative(arr)){
                    for(int num: arr){
                        if(num>max){
                            max = num;
                        }
                    }
                    return max;
                }

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
        double max= Double.NEGATIVE_INFINITY;
        int currSum = 0;
        
        //check if all elements in the array is negative
        if(isNegative(arr)){
            for(int num: arr){
                if(num>max){
                    max = num;
                }
            }
            return (int)max;
        }



        for(int ctr=0;ctr<arr.length;ctr++){
            if(currSum<0){
                currSum=0;
            }
            currSum +=arr[ctr];
            if(max<currSum){
                max = currSum;
            }
        }
        return (int)max;
    }
    public static void main(String args[]){
        System.out.println(maxSum(arr));
        System.out.println(maxSumKaden(arr));
    }
}