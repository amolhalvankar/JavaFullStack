package Constructor;


class Student{

    String name;
    int age ;


    Student(String n,int a){
        this.name=n;
        this.age=a;

    }

    void output(){
        System.out.println("Name = " +name);
        System.out.println("Age = " +age);

    }
}
public class ParaCon {
    public static void main(String[] args) {
        Student student = new Student("Amol",22);
        student.output();
        
    }
   
    
}
