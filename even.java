public class even{
    public static void main(String[] a){
        int ai=0;
        int arr[] = {2 ,5,3,6,1,8,3,4};
        for(int i : arr){
            if(i%2 == 0){
                ai+=i;
            }
        }
        System.out.println(ai);
    }
}
