
//move all x to the end of the string //axbcxxd = abcdxxx
import java.util.Scanner;

public class q5 {
    public static void moveCharToEnd(String str, String str1, String str2, int ctr, char ch) {
        if (ctr == str.length()) {
            System.out.println(str1 + str2);
            return;
        }

        if (str.charAt(ctr) == ch) {
            str2 = str2 + str.charAt(ctr);
        } else {
            str1 = str1 + str.charAt(ctr);

        }
        moveCharToEnd(str, str1, str2, ctr + 1, ch);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a word: ");
        String str = sc.nextLine();

        System.out.print("enter a character: ");
        char ch = sc.nextLine().charAt(0);

        moveCharToEnd(str, "", "", 0, ch);
        sc.close();
    }
}
