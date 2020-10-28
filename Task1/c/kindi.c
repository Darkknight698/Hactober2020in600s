## Algorithm for factorial

   START
   Step 1 → Take integer variable A
   Step 2 → Assign value to the variable
   Step 3 → From value A upto 1 multiply each digit and store
   Step 4 → the final stored value is factorial of A
   STOP


#include<stdio.h>  
int main()    
{    
 int i,fact=1,n;    
 printf("Enter a number: ");    
  scanf("%d",&n);    
    for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  printf("The factorial of number %d is: %d",n,fact);    
return 0;  
}   
