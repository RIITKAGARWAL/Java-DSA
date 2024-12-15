// find total number of paths can be taken to reach the destination
//constraints : only downwards and rightwards movement allowed 

import java.util.Scanner;

public class q2 {
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // move downwards
        int countDown = countPaths(i + 1, j, n, m);
        // move right
        int countRight = countPaths(i, j + 1, n, m);

        return countDown + countRight;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input: ");
        int n = sc.nextInt();
        System.out.println("please input: ");
        int m = sc.nextInt();
        
        System.out.println("output: " + countPaths(0, 0, n, m));
        sc.close();
    }

}