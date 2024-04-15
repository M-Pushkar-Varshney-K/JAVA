import java.util.Scanner;

public class Aa{

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double speed = sc.nextDouble();
        double time = sc.nextDouble();

        double dis = calDist(speed,time);
        System.out.println(dis);

        sc.close();
     }
     public static double calDist(double s,double t){
        return s*t;
    }
}