// print number from 5 to 1

public class q1{


    public static void printNum(int num){

        if (num==0){
            return;
        }
        printNum(--num);
        printNum(num);
        System.out.println(num);
    }

    public static void main(String args[]){
        System.out.println("Jai Shree Ram!");
        printNum(5);
        
    }
}