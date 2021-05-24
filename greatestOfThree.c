#include<stdio.h>
int main()
{
    int number1, num2, num3;
    printf("Enter the numbers : \n");
    scanf("%d %d %d", &number1, &num2, &num3);
    greatestOfThree(number1,num2,num3);
}
void greatestOfThree(int a, int b, int c)
{
    if(a>b && a>c)
    printf("a = %d is greatest\n", a);
    else if(b>a && b>c)
    printf("b = %d is the greatest \n", b);
    else
    printf("c = %d is the greatest.", c);
    
}