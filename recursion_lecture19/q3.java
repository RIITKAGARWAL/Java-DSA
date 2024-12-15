//in how many ways  a 1xn tiles be fitted in m X n area

import java.util.Scanner;
public class q3 {
    public static int countWays(int row, int col){
        if(row<col){
            return 1; //only one way that is horizontal
        }
        if(row==col){   //only one way either horizontal or vertical
            return 2;
        }
        // if tile is placed vertically
        int totalVplacement = countWays(row-col, col);
        //if tile is placed horizontally
        int totalHplacement = countWays(row-1, col);

        return totalVplacement+totalHplacement;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input rows: ");
        int row = sc.nextInt();
        System.out.println("please input cols: ");
        int col = sc.nextInt();
System.out.println("output: "+countWays(row, col));
        sc.close();
    }

}