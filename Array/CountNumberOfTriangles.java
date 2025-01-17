public class CountNumberOfTriangles {
    

    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        int count = 0;
        
        
        for(int idx1 = 0;idx1<arr.length;idx1++){
        for(int idx2 = idx1+1;idx2<arr.length;idx2++){
            for(int idx3 = idx2+1;idx3<arr.length;idx3++){
                int sum = arr[idx1] + arr[idx2] + arr[idx3];
                boolean isTest1 = sum-arr[idx1]>arr[idx1];
                boolean isTest2 = sum-arr[idx2]>arr[idx2];
                boolean isTest3 = sum-arr[idx3]>arr[idx3];
                
                if(isTest1 && isTest2 && isTest3){
                    count++;
                }
            }
        }
        
    }
        return count;
    }}

