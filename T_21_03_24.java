interface A{
void a();
}
interface B{
int b(int c);
}
interface C {
int c(int a,int b);
}

public class T_21_03_24 {
public class ABC{}
    public static void main(String[] args) {
        B bc = (int n) ->
            // System.out.println("2nd one");
            n*n*n;

        A ac = () -> {
            System.out.println("inside 1st");
        };
        System.out.println(bc.b(5));
        ac.a();
        C cc = (a, b) -> { System.out.println("Sum of two numbers: "); return a+b; };
        System.out.println(cc.c(5, 3));
    }
}