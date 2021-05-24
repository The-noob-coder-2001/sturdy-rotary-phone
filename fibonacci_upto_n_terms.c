// C program to find the series of fibonacci numbers upto nth term
#include<stdio.h>
void printFibonacci(int n);
int main()
{
    int number;
    printf("enter a number : \n");
    scanf("%d", &number);
    printFibonacci(number);
}
// 1 1 2 3 5 8 13 ....
void printFibonacci(int n)
{
    int sum=0;
    for( int i=1; sum<=n; i++)
    {
        printf("%d", i);
        sum =sum + i;
        printf(", %d ,", sum);
    }
                                    
}