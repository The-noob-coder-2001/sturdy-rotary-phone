#include<stdio.h>
int main()
{
    int number;
    printf("Enter the number : \n");
    scanf("%d", &number);
    int sum = 0;
    sum = (number*(number+1))/2;
    printf("Sum of %d numbers is : %d", number, sum);
}