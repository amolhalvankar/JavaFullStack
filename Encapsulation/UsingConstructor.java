package Encapsulation;

class Student {

    private int age;
    private String name;

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

public class UsingConstructor {

    public static void main(String[] args) {
        Student obj = new Student();
        obj.setAge(22);
        System.out.println("Age = " + obj.getAge());
        obj.setName("Amol");
        System.out.println("Name = " + obj.getName());

    }
}
