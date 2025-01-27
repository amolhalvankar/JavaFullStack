package functions;

import java.util.Scanner;

public class Addition {

    static int add(int a, int b) {
        int res = a + b;
        System.out.println("Res = " + res);
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number first : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number second : ");
        int num2 = sc.nextInt();

        add(num1, num2);

    }

}
