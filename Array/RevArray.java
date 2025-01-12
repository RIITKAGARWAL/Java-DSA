public class RevArray {
    static void reverseArray(int arr[]){
        int idx1 = 0;
        int idx2 = arr.length-1;
        int mid = idx2/2;
        int temp ;
        while(idx1!=mid){
            temp = arr[idx1];
            arr[idx1]= arr[idx2];
            arr[idx2]= temp;
            
            idx1++;
            idx2--;
            
        }
    }
    static void revArrayViaRecursion(int arr[],int strtIdx,int lstIdx){
        if(strtIdx>lstIdx){
            return;
        }
        
        int temp = arr[strtIdx];
        arr[strtIdx] = arr[lstIdx];
        arr[lstIdx]= temp;

        revArrayViaRecursion(arr, strtIdx+1, lstIdx-1);
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        reverseArray(arr);
        
        for(int ctr=0;ctr<arr.length;ctr++){
            System.out.print(arr[ctr]+ " ");
        }

System.out.println("");

        revArrayViaRecursion(arr,0,arr.length-1);
        
        for(int ctr=0;ctr<arr.length;ctr++){
            System.out.print(arr[ctr]+ " ");
        }
        
    }
}
