package Abstraction;

abstract class College {
    College() {
        System.out.println("Abstract class constructor");
    }

    abstract void show();

    void input() {
        System.out.println("Form abstract class");
    }
}

class Student extends College {
    Student() {
        super();
        System.out.println("Child class constructor");
    }

    @Override
    void show() {
        System.out.println("From Child");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.show();
        obj.input();
    }

}
