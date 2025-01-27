package Polymorphism;

class A {

    void show(int a) {
        int age = a;
        System.out.println("Age  = " + age);
    }

}

class B extends A {
    void show(int a, String n) {
        int age = a;
        String name = n;
        System.out.println("Age  = " + age);
        System.out.println("Name  = " + name);

    }

}

public class CompileTImePolymorphism {

    public static void main(String[] args) {
        B obj = new B();
        obj.show(12);
        obj.show(15, "Amol");

    }

}
