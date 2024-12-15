import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class adityaSirQues {
    //declaration of sum variable as static
    public static int sum;

    //declaration of String Arraylist object
    public static ArrayList<String> list = new ArrayList<>();

    //recursive function r
    public static void r(int[] arr,int idx,String idxCollection,int total)
    {
        //base condition 
        if(arr.length == idx){
            if((total > sum-2) && (total < sum +2))
            {
                String temp = "At idx "+idxCollection + "   total is "+total;
                list.add(temp);
                System.out.println("At idx "+idxCollection + "   total is "+total);
            }
            return;
        }

        
        r(arr,idx+1,idxCollection,total);
        r(arr,idx+1,idxCollection + " " + idx,total + arr[idx]);

    }
    
    //main 
    public static void main(String args[]){
        System.out.println("\n\nHi there! My Name is Program Aditya");
        System.out.println("From a list of Random Numbers...I can Provide you the sum of numbers using Least Number of Indices\n ");
        System.out.println("Enter Size of Array: ");
        
        //creating scanner object
        Scanner sc = new Scanner(System.in);
        
        //declaring and initializing size
        int size = sc.nextInt();

        System.out.println("We have an Array of Size "+size+" .I am putting some random numbers i.e. Single digit to double digits: 0-99\n");
        
        // creating integer array
        int []arr = new int[size];

        //creating a Random object
        Random rnd = new Random();
        
        //initializing with random numbers
        for(int idx=0; idx<size; idx++)
        {
            arr[idx] = rnd.nextInt(99);
            System.out.println("At idx"+idx+" value is "+arr[idx]);
        }
        System.out.println("-----------------------------------");
        System.out.println("Tell me The sum that you Expect : ");

        //declaring and initializing sum
        sum = sc.nextInt();

        System.out.println("The Sum should be "+sum+" or Near the range of plus/minus 2 of SUM.");

        System.out.println("-----------------------------------");
        System.out.println("Displaying all Indices whose sum results near "+ sum);
       
        //calling recursive function
       r(arr,0,"",0);
        //
        System.out.println("---------------------------");
        System.out.println("minimum indices result below");
       //dealing minimum number of indices thing
       int count = list.get(0).length();
       for(String str : list) {
        if (count >str.length()){
            count = str.length();
        }
       }
       for(String str: list){
        if(count == str.length()){
            System.out.println(str);
        }
       }
       
       //closing scanner object
        sc.close();
    }
}