package Constructor;


class Person{
    String name;
    int age;

    Person(){
       name="Amol";
       age=22;
    }

    void output(){
        System.out.println("Name = " + name);
        System.out.println("Age = "+ age);
    }
}
public class NonParaCon {
    public static void main(String[] args) {
        
        Person obj =new Person();
        obj.output();

    }
}
