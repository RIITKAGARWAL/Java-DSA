// Learning Backtracking concept 
// print all the permutation output of string "abc".
import java.util.Scanner;
class q1{

    public static void permutation(String str,String newStr){
        //base condition
        if(str.length()==0){
            System.out.println(newStr);
        }
        for(int idx= 0; idx<str.length();idx++){
            char ch = str.charAt(idx);
            String modStr= str.substring(0,idx)+str.substring(idx+1,str.length());
            permutation(modStr, newStr+ch);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("I will provide you permutations of the input data");
        System.out.println("please Input Data: ");
        String str = sc.nextLine();
        System.out.println("Showing Information: ");
        permutation(str,"");
        sc.close();

    }
}