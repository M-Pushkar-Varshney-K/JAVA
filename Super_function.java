public class A{
    int a;
    int b;
    A(){}
    A(int a,int b){
        this.a = a;
        this.b = b;
    }
    void dis(){
        System.out.println(a +" "+ b);
    }
}

    public class B extends A{
        int c;
        int d;
        B(int a,int b,int c,int d){
            super(a,b);
            this.c = c;
            this.d = d;
        }
    
        void dis(){
            super.dis();
            System.out.println( c+" "+d);
        }
}

class Super_function {
    public static void main(String[] a){
        B ab = new B(1,2,3,4);
        ab.dis();
    }
}