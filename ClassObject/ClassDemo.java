package ClassObject;

class Person{

    String name;
    int age;
    String addr;

    void input(String n , int a ,String ad){

        name = n ;
        age = a;
        addr = ad;
    }

    void output(){
        System.out.println("Name is : " +name );
        System.out.println("Age is : " +age);
        System.out.println("From : " +addr);
    }
}

public class ClassDemo {

    public static void main(String[] args) {
        Person obj = new Person();
        obj.input("Amol", 22 , "Kolhapur");
        obj.output();
    }
    
}
