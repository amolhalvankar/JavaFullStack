
import java.util.Scanner;


public class switchDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vehicletype = sc.nextLine();
        int fee = 0;
        System.out.println("Enter type of vehicle : ");
        switch(vehicletype) {
            case "cycle":
                fee = 5;
                break;
                
            case "bike":
                fee = 10;
                break;

            case "car":
                fee = 15;
                break;

            case "bus":
                fee = 20;
                break;

            case "truck":
                fee = 30;
                break;

            default:
                System.out.println("Unknown Vehicle..");

        }
        System.out.println("Fee for vehicle" + vehicletype +"is" + fee);

    }

}
