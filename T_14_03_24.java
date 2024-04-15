import java.util.logging.StreamHandler;

public class T_14_03_24{
    public static void main(String[] args) {

        // Person.Age obj1 = new Person.Age();
        // obj1.disp();

        // Person obj = new Person();
        // obj.Aadhar obj2 = obj.new Aadhar();
        // obj2.dis();
        Shape obj1 = new Shape();
        Shape ano = new Shape(){
            void dis(){
                System.out.println("You are in the anonymous class");
                newMethod();
            }
            void newMethod(){
                System.out.println("New method of anonymous class");
            }
        };
        ano.dis();
    }
}

class Shape{
    void dis(){
        System.out.println("Inside the Parent class");
    }
}
// class Person{
//     class Aadhar{
//         void dis(){System.out.println("in aadhar");}
//     }
//     static class Age {
//         void disp(){System.out.println("in age");}
//     }
// }