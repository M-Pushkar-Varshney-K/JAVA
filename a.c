#include <stdio.h>

void reverseofnum(int n)
{   int rem=0,rev=0;
    while(n!=0){
        rem=n%10;
        rev=(rev*10)+rem;
        n=n/10;
    }
   printf("%d",rev);
}
int main()
{
    int i;
    printf("enter a number ");
    scanf("%d", &i);
 
    reverseofnum(i);
     return 0;
}