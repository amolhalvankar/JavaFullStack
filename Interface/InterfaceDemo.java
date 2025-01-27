package Interface;

interface A {

    int age = 22; // By default Final and Static
    String name = "Amol"; // Final variable must be initialized

    void show();

    void output(); // By Default Public and Abstract
}

class B implements A {
    public void show() {
        System.out.println("show Method");
    }

    public void output() {
        System.out.println("output Method");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.output();
        System.out.println(A.age);
        System.out.println(A.name);
    }

}
