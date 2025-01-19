
import java.util.Scanner;
public class whileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1 ;
        System.out.println("Enter number to print table: ");
        int num = sc.nextInt();
        while(i<=10){
            System.out.println(+num+"X"+i + "=" +num*i );
            i++;
        }
        
    }
}
