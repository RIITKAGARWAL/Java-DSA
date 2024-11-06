//print all the unique subsequences of the string.
//"aaa"=> aaa , aa , a

import java.util.HashSet;
import java.util.Scanner;
class q8{
      public static HashSet<String> hashSet = new HashSet<>(); // Use HashSet for unique storage

    public static void printUniqueSubSequences(String str, int idx, String newStr) {
        if (idx == str.length()) {
            if (!hashSet.contains(newStr)) {  // Check if newStr is unique
                System.out.println(newStr);  // Print unique subsequence
                hashSet.add(newStr);         // Add to HashSet to track
            }
            return;
        }
        char ch = str.charAt(idx);
        printUniqueSubSequences(str, idx+1, newStr);
    
        printUniqueSubSequences(str, idx+1, newStr+ch);
    }
    public static void main(String args[]){
        
        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printUniqueSubSequences(str, 0, "");

        sc.close();
    }
}