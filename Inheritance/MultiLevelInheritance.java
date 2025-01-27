package Inheritance;

class A {

    String name;

    void a() {
        System.out.println("Name is : " + name);
        System.out.println("Class A");
    }

}

class B extends A {

    int age;

    void b() {
        a();
        System.out.println("Age is: " + age);

        System.out.println("Class B");
    }
}

class C extends B {

    void c() {
        System.out.println("Class C");
    }

}

public class MultiLevelInheritance {

    public static void main(String[] args) {
        C obj = new C();
        obj.name = "Amol";
        obj.age = 22;
        obj.a();
        obj.b();

    }

}
