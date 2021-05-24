#include<stdio.h>
int main()
{
    int number;
    printf("Enter the number : \n");
    scanf("%d", &number);
    oddEven(number);
}
void oddEven(int n)
{
    if(n%2==0)
    printf("Even number \n");
    else if(n%2!=0)
    printf("Odd number \n");
    else
    printf("Zero");
}