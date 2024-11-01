
//calculate power of a mumber via binary tree

import java.util.*;

public class q6 {

    public static int calcPower(int base, int degree) {
  
            if (degree==1){
                return base;
            }
            
            else{
                if(degree%2==0){
                return (calcPower(base,degree/2) * calcPower(base,degree/2));
                }
                else{
                    return(calcPower(base,(degree-1)/2) * calcPower(base,(degree-1)/2) * base );
                }
            }
        }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter base value: ");
        int base = sc.nextInt();
        
        System.out.print("enter degree value: ");
        int degree = sc.nextInt();

        int result = calcPower(base, degree);
        System.out.println("Result is : "+result);
        sc.close();

    }

}
