package Encapsulation;


//Using Getter and Setter method

class Student{
    private int age;

    void setAge(int age){
        this.age = age;

    }

    int getAge(){
        return age;
    }
}
public class Demo {
    public static void main(String[] args) {
        Student obj =new Student();
        obj.setAge(22);
        System.out.println("Age is : "+obj.getAge());

    }
    
}
