//print power of a number

    import java.util.*;
    public class q5 {
        public static int calcPower(int base,int degree){

            if(base==0){
                return 0;
            }
            if(degree==0){
                return 1;
              }
            else{
                return base * calcPower(base,degree-1);      

            }


            }
        
        public static void main(String[] args) {
            int base,degree;
            Scanner sc = new Scanner(System.in);
            System.out.print("enter Base value: ");
            base =sc.nextInt();
            System.out.print("enter Degree value: ");
            degree=sc.nextInt();
      
          int result = calcPower(base,degree);
          System.out.println("value is : "+result);
          sc.close();
        }
        
    
    }
    