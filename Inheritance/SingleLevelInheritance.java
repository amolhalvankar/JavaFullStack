package Inheritance;

class Student {

    String name;
    int age;

    void output() {
        System.out.println("Name is : " + name);
        System.out.println("Age is :" + age);
    }
}

class Teacher extends Student {

}

public class SingleLevelInheritance {

    public static void main(String[] args) {
        Teacher th = new Teacher();
        th.name = "Amol";
        th.age = 22;
        th.output();
    }

}


