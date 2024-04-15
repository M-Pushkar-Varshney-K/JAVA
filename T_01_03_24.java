interface Shape{
    public abstract double rec_area(double l,double b);
    public abstract double cir_area(double r);
}

class rect implements Shape{
    public double rec_area(double l,double b){
        return l*b;
    }
}

class cir implements Shape{
    public double cir_area(double r){
        return (3.14*r*r);
    }
}


public class T_01_03_24 {

    public static void main(String[] args) {
        
        
    }
}