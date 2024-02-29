import java.util.Scanner;
public class H {
    public static void A(int[] a){

        for(int i=0;i<a.length-1;i++){
            for(int j=1;j<a.length;j++){
                if(a[j-1] > a[j]){
                    int t= a[j];
                    a[j] = a[j-1];
                    a[j-1] = t;
                }
            }
        }

        int[] b = new int[a.length * 2];
        int c = 0;
        for(int i = 0; i < a.length; i++){
            int d = 0;
            if(a[i] != 0){
                b[c] = a[i];
                c++;
                for(int j = i; j < a.length; j++){
                    if(a[j] == a[i]){
                        d++;
                        a[j] = 0;
                    }
                }
                b[c] = d;
                c++;
            }
        }

        for(int i = 0; i < c; i += 2){
            System.out.println(b[i] + "->->" + b[i + 1]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }
        A(a);
        s.close();
    }
}
