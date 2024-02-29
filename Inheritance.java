import java.util.*;
class Person {
String name;
int age;
void display() {
System.out.println("Name is : " + name);
System.out.println("Age is : " + age);
   }
}
class Employees extends Person {
int id;
double salary;
void display() {
super.display();
System.out.println("Id is :" + id);
System.out.println("Salary is : " + salary);
   }
}
public class Inheritance {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Employees e1 = new Employees();
 e1.name = sc.nextLine();
 e1.age = sc.nextInt();
 e1.id = sc.nextInt();
 e1.salary = sc.nextDouble();
 sc.close();
 e1.display();
   }
}