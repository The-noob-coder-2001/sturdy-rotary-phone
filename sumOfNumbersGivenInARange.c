#include<stdio.h>
int main()
{
    int start, end;
    int sum = 0;
    printf("Enter the starting number and ending number separated by spaces: \n");
    scanf("%d %d", &start, &end);
    for( int i=start; i<=end;i++)
    {
        sum = sum+i;
    }
    printf("Sum of numbers from %d to %d is %d", start, end, sum);
}