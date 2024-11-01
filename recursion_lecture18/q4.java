
//check if an array is strictly increasing or not
import java.util.Scanner;

public class q4 {
    public static void isSorted(int[] arr, int length) {
        if (length == 0) {
            System.out.println("Strictly increasing");
            return;
        }

        if (arr[length] < arr[length - 1]) {
            System.out.println("It is not strictly increasing");
            return;
        } else {
            isSorted(arr, length - 1);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("enter size of an array: ");
int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0 ; i<size;i++){
            arr[i]= sc.nextInt();
        }
        
        isSorted(arr, arr.length-1); 
         sc.close();
    }
}
