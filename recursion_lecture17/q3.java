
    //print factorial of a number

import java.util.*;

public class q3 {
    



    public static int fact(int num){
           

        if(num==0){
           
            return 1;
        }
        else{
            return num * fact(num-1);        }

        }
    
    public static void main(String[] args) {
        int num,factorial;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        num =sc.nextInt();
  
      factorial = fact(num);
      System.out.println("Factorial of "+num+ " is "+factorial);
      sc.close();
    }
    

}
