package Polymorphism;

class A {

    void show() {
        System.out.println("Class A");

    }

    class B {

        void show() {
            System.out.println("Class B");
        }
    }
}

public class RunTimePolymorphism {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

    }

}
