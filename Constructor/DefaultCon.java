package Constructor;


class Person{
    String name;
    int age;

    void output(){
        System.out.println("Name is : " +name );
        System.out.println("Age is : " +age);

}
}
public class DefaultCon {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.output();
    }
    
}
