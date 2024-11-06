//print all the subsequences of the string.
import java.util.Scanner;
class q7{
    public static void printSubSequences(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(idx);
        printSubSequences(str, idx+1, newStr);
    
        printSubSequences(str, idx+1, newStr+ch);
    }
    public static void main(String args[]){
        
        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printSubSequences(str, 0, "");

        sc.close();
    }
}