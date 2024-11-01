
//print all the elements without repeating // adfdssaasddf = adfsa
import java.util.Scanner;

public class q6 {
    public static String hashmap = "$".repeat(26);
    // public static boolean hashmap = new boolean[26];
    public static char ch;
    public static int asc;
    public static int idx;

    public static void noRepeationOfChar(String str, int ctr, String newStr) {
        if (ctr == str.length()) {
            System.out.println(newStr);
            return;
        }
        ch = str.charAt(ctr);
        asc = (int) ch;
        idx = asc - 97;

        if (hashmap.charAt(idx) == ch) {
            ctr++;
        } else {
            // hashmap.replace('$',ch);
            hashmap = hashmap.substring(0, idx) + ch
                    + hashmap.substring(idx + 1);
            newStr += ch;
        }
        noRepeationOfChar(str, ctr, newStr);

    }

    public static void main(String args[]) {
        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.replaceAll("\\s", "");
        str = str.toLowerCase();

        noRepeationOfChar(str, 0, "");
        sc.close();
    }
}
