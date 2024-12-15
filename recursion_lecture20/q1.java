// Learning Backtracking concept 
// print all the permutation output of string "abc".
import java.util.Scanner;
class q1{

    public static void backTracking(String str,String newStr){
        if(str.length()==0){
            System.out.println(newStr);
            return;
        }



        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String modifiedStr = str.substring(0, i)+str.substring(i+1, str.length());
            backTracking(modifiedStr, newStr+currChar);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please Input Data: ");
        String str = sc.nextLine();
        System.out.println("Showing Information: ");
        backTracking(str,"");
        sc.close();

    }
}