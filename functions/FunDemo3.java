package functions;
import java.util.Scanner;
public class FunDemo3 {

    static void checkEvenOdd(int num){

        if(num%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
       
        checkEvenOdd(num);
    }
    
}
