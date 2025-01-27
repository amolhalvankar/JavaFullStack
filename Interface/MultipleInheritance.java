package Interface;

interface A {

    int age = 22; // By default Final and Static
    String name = "Amol"; // Final variable must to be initialized

    void show();

    void output(); // By Default Public and Abstract

    default void data() {
        System.out.println("default method..");
    }

}

interface C extends A {
    void details();
}

class B implements A, C {
    public void show() {
        System.out.println("show Method");
    }

    public void output() {
        System.out.println("output Method");
    }

    public void details() {
        System.out.println("details Method");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.output();
        System.out.println(A.age);
        System.out.println(A.name);
        obj.data();
        obj.details();

    }

}
