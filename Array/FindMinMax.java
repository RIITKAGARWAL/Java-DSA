public class FindMinMax {
    
    static int arr[] = {22, 14, 8, 17, 35, 3};
    static void findMinMax(int arr[],int length,int mid){
                int idx1=0;int idx2 = length-1;
                int min = arr[0];int max = arr[0];
                while(!(idx1==mid && idx2==mid)){
                    if(arr[idx1]>=arr[idx2]){
                        if(max<arr[idx1]){
                        max=arr[idx1];
                        }
                        if(min>arr[idx2]){
                        min=arr[idx2];
                        }
                    }
                    else{
                        if(min>arr[idx1]){
                        min=arr[idx1];
                        }
                        if(max<arr[idx2]){
                        max=arr[idx2];
                        }
                    }
                    
                    
                    if(idx1!=mid){
                        idx1++;
                    }
                    if(idx2!=mid){
                        idx2--;
                    }
    
                    
                }
                System.out.println(min +" "+ max);
    }
    public static void main(String[] args) {
        findMinMax(arr,arr.length,arr.length/2);
    }
}
