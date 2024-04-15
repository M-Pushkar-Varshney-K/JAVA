interface Drawable{
    void draw();
    default void erase(){
        System.out.println("Erasing....");
    }
}
interface AB{
    void ab();
    // void bc(){
    //     System.out.println("hii");
    // }
}
class Circle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing a circle...");
    }
    @Override
    public void erase(){
        Drawable.super.erase();
        System.out.println("Erasing a cicrle...");
    }
}
abstract class A{
    abstract void a();
}

public class App {

    public static void main(String[] args) {
        String x = "Code",y = "tantra";
        System.out.println(x+y);
        for(int i=x.length()-1;i>=0;i--){
            System.out.println(x[2]);
        }
        // Circle circle = new Circle();
        // circle.draw();
        // circle.erase();
        // B ab = new B();
        // ab.a();
    }
}