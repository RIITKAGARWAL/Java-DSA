import java.util.Scanner;

public class q1 {
    public static void printPermutation(String str, String permutationStr) {
        if(str.length()==0){
            System.out.println(permutationStr);
            return;
        }

        for (int i=0; i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr =  str.substring(0,i) + str.substring(i+1, str.length());
printPermutation(newStr, permutationStr+currChar);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input: ");
        String str = sc.nextLine();
        
        System.out.println("Output: ");
        printPermutation(str, "");
        sc.close();
    }

}