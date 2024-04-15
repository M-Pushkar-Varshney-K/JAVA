import java.lang.Math;
import java.util.Scanner;

interface A{
    double sum (double a, double b);
}
interface B{
    String concat(String a, String b);
}
public class T_28_03_24 {
    public static void main(String[] args) {
        A obj = (double a, double b)->(a+b);
        System.out.println(obj.sum(2.2, 2.5));
        B objB = (String a, String b)->a+b;
        System.out.println(objB.concat("M.Pushkar ", "Varshney.K"));
    }
}
