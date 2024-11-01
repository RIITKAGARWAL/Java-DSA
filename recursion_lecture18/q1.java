//tower of hanoi
import java.util.Scanner;

public class q1 {
    public static void towerOfHanoi(String src,String helper,String dest,int discNumber){
            if(discNumber==1){
                System.out.println(discNumber+" transferred from "+src+" to " + dest);
            }
            else{
                towerOfHanoi(src, dest, helper, discNumber-1);
                System.out.println(discNumber+" transferred from "+src+" to " + dest);  
                towerOfHanoi(helper, src, dest, discNumber-1);   
                   }
        
        }
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int discNumber =sc.nextInt();
        towerOfHanoi("source","helper" , "destination",discNumber);
        sc.close(); 
    }
}
