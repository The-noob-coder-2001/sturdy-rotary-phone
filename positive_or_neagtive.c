#include<stdio.h>
int main()
{
    int number;
    printf("Enter the number : \n");
    scanf("%d", &number);
    positiveNegative(number);
}
void positiveNegative(int num)
{
    if(num>0)
    printf("Positive");
    else if(num<0)
    printf("Negative");
    else
    printf("Zero");
}