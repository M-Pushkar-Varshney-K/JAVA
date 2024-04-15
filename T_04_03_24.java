import java.util.*;

class Shape{
    void showColor(){
        System.out.println("Color of the Shape: RED");
    }
}

class Circle extends Shape{
    double radius;
    // Circle(){}
    Circle(double r){
        radius = r;
        //area = ;
    }
    void displayCircleArea(){
        System.out.printf("Area of Circle : %.2f\n",radius*radius*Math.PI);
    }
}

class Rectangle extends Shape{
    double length,width;
    // Rectangle(){}
    Rectangle(double l,double b){
        length = l;   width = b;
        // area = ;
    }
    void displayRectangleArea(){
        System.out.printf("Area of rectangle: %.2f\n",length*width);
    }
}


public class T_04_03_24 {
    void display(Shape obj) {
        if (obj instanceof Circle) {
            Circle circle = (Circle) obj;
            circle.displayCircleArea();
            circle.showColor();
        } else if (obj instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) obj;
            rectangle.displayRectangleArea();
            rectangle.showColor();
        }
    }


    public static void main(String[] args) {
        Circle cir = new Circle(7);
        Rectangle rec = new Rectangle(5, 10);
        // cir.color = "Dark Red";
        // rec.color = "Light Blue";
        T_04_03_24 ab = new T_04_03_24();
        ab.display(cir);
        ab.display(rec);
    }
}