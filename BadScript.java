// Write an application named BadScript in which you declare an aarray of 5 names. Write a try block in which you prompt the user........The carch block should also display an appropriate error message.

// 05_04_24

import java.util.*;;
public class BadScript{
    public static void main(String[] args) {
    //     String[] array_of_name = {"MPVK", "Pushkar", "Gopi", "Rudra", "Kartik"};
    //     try{
    //         Scanner sc = new Scanner(System.in);
    //         int n = sc.nextInt();
    //         System.out.println("Name at the index "+n+": "+array_of_name[n]);
    //     }
    //     catch(ArrayStoreException e){
    //         System.out.println("An array store exception occure and its name is: "+ e);
    //     }
    //     catch(ArrayIndexOutOfBoundsException e){
    //         System.out.println("An array out of bond occure and it's real name: "+e);
    //     }
    //     catch(Throwable e){
    //         System.out.println("ALL error come: "+e);
    //     }
    //     // catch(InputMismatchException e){
    //     //     System.out.println("You give the wrong input....");
    //     // }

    //     // try{
    //     //     int a[] = new int[5];
    //     //     a[5] = 30/0;
    //     // }
    //     // catch(ArrayIndexOutOfBoundsException e){ System.out.println("yee");}
    //     // catch(ArithmeticException e){ System.out.println("cooo");}
    //     // catch(Exception e){ System.out.println("bbbbbb");}
    //     a();
    //     System.out.println("aaa");
    // }
    // static void a(){
    //     System.out.println("hhhh");
    int x = fun();
    
    }
    static int fun(){
        int a = 5;
        int b = a+3;
        if(a != -9999999)
            return b;
        System.out.println(b);
        return 0;
    }
}
//26-202
