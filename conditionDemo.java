
import java.util.Scanner;
public class conditionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalpass =1234;
        System.out.println("Enter Your Password : ");
        int pass = sc.nextInt();
        if(pass==originalpass){
            System.out.println("Login Successful!");
        }else{
            System.out.println("Inccorect password!");
        }
        
    }
   
   
            
    
    
    
}
