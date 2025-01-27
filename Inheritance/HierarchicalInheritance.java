package Inheritance;

class College {

    String cname;
    int ccode;

    void output() {
        System.out.println("College name is : " + cname);
        System.out.println("College code is :" + ccode);
    }

}

class Student extends College {

}

class Teacher extends College {

}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Student st = new Student();
        Teacher th = new Teacher();

        st.cname = "DY Patil University";
        th.ccode = 0012;

        st.output();

    }

}
