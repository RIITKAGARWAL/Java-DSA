
//print first and last occurence of a character
import java.util.Scanner;

public class q3 {
    public static void printFirstLastOccurence(String str, char ch, int ctr, int lIdx, boolean isFO, boolean isLO) {
        if (ctr == lIdx || ((isFO == true) && (isLO == true))) {
            return;
        }
        else if (isFO == false) {
            if ((str.charAt(ctr) == ch)) {
                System.out.println("First occurence of string: " + str + " is found at position number: " + (ctr + 1));
                isFO = true;
            } else {
                printFirstLastOccurence(str, ch, ctr + 1, lIdx, isFO, isLO);
                printFirstLastOccurence(str, ch, ctr, lIdx-1, true, isLO);


            }
        }

        else{
            if ((str.charAt(lIdx) == ch)) {
                System.out.println("Last occurence of string: " + str + " is found at position number: " + (lIdx + 1));
                isLO = true;
            } else {
                printFirstLastOccurence(str, ch, ctr, lIdx-1, isFO, isLO);

            }
        }
        }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a word: ");
        String str = sc.nextLine();

        System.out.print("enter a character: ");
        char ch = sc.nextLine().charAt(0);

printFirstLastOccurence(str, ch, 0, str.length()-1, false, false);
        sc.close();
    }
}
