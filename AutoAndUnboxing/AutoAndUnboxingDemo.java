package AutoAndUnboxing;

public class AutoAndUnboxingDemo {

    public static void main(String[] args) {
        int a = 22;
        Integer i = Integer.valueOf(a); // Auto-Boxing
        Integer j = a; // Auto-Boxing

        int b = i.intValue(); // Un-Boxing
        int c = i; // Un-Boxing

        System.out.println("Value of a i = " + i);
        System.out.println("Value of a j = " + j);
        System.out.println("Value of a b = " + b);
        System.out.println("Value of a c = " + c);

    }

}
