//print sum of numbers upto n
import java.util.*;
public class q2 {

    public static void sum(int initial, int finall, int total){
            total = total + initial;

        if(initial == finall){
            System.out.println("sum is : "+total);
            return ;
        }
        else{
        // total = total + initial;
        sum(initial + 1, finall, total);
        }

        }
    
    public static void main(String[] args) {
        int initial ,finall;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter initial number: ");
        initial =sc.nextInt();
        System.out.print("Enter final Number: ");
        finall = sc.nextInt();
      sum(initial,finall,0);

      sc.close();

    }
    
}
