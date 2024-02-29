 class person{
    void dis(){
        System.out.println("\nPerson");
    }

    void print(){
        System.out.println("2nd function of person\n");
    }
}

 class stu extends person{
    void dis(){
        System.out.println("Student\n");
    }
    void check(){
        System.out.println("Checking it is working with run time polymorphism");
    }
}

public class T_29_02_24 {
    public static void main(String[] args) {
        person p = new person();
        stu s = new stu();

        show_check(p);
        show_check(s);
            // s.dis();
            // s.check();
            // p.dis();
    }

    public static void show_check(person abc){
        if(abc instanceof stu){
            ((stu)abc).check();
            abc.dis();
        }else{
            abc.dis();
            abc.print();
        }
    }
}
