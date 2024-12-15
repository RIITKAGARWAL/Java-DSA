import java.util.Scanner;
//find total number of ways you can invite people either solo or duo




public class q4 {

    public static int numOfWays(int n){
        if(n<=1){
            return 1;
        }
        int totalSolo = numOfWays(n-1) ;
        int totalDuo = (n-1) * numOfWays(n-2);
        return (totalSolo + totalDuo);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input: ");
        int n = sc.nextInt();

        System.out.println(numOfWays(n));
        sc.close();
    }

}