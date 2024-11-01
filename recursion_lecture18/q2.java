//print reverse of a string
import java.util.Scanner;

public class q2 {
    public static void printRevStr(String str,int idx){
            if(idx==0){
                System.out.print(str.charAt(idx));
            }
            else{
                
                System.out.print(str.charAt(idx));
                printRevStr(str, idx-1);
            }
        
        }
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.print("enter a word: ");
        String str =sc.nextLine();
        printRevStr(str,str.length()-1);
        sc.close(); 
    }
}
