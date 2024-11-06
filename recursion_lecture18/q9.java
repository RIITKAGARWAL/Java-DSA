
// print mobile keypad combination
import java.util.Scanner;

public class q9 {
    public static String[] arrStr = {
            ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"
    };

    public static void printKeypadCombination(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapStr = arrStr[currChar - '0'];

        for (int i = 0; i < mapStr.length(); i++) {
            printKeypadCombination(str, idx + 1, combination + mapStr.charAt(i));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter keyboard pattern: ");
        String str = sc.nextLine();
        printKeypadCombination(str, 0, "");

        sc.close();
    }
}
