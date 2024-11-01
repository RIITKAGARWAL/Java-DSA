
//print fibonacci series till nth term

import java.util.*;

public class q4 {

    public static void printFibo(int idx1, int idx2, int start, int ctr) {
        if (start == 0) {
            System.out.print(" 0 ");
            printFibo(idx1, idx2, start + 1, ctr);

        } else if (start == 1) {
            System.out.print(" 1 ");
            printFibo(idx1, idx2, start + 1, ctr);

        } else if (start == ctr) {

            return;
        } else {

            int temp = idx2;
            idx2 = idx2 + idx1;
            idx1 = temp;
            System.out.print(idx2 + " ");

            printFibo(idx1, idx2, start + 1, ctr);


        }
    }

    public static void main(String[] args) {
        int ctr;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many fibonnaci numbers do you want to see: ");
        ctr = sc.nextInt();

        printFibo(0, 1, 0, ctr);
        sc.close();

    }

}
