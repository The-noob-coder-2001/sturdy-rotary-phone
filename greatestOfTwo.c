#include<stdio.h>
int main()
{
    int number1, num2;
    printf("Enter the numbers : \n");
    scanf("%d %d %d", &number1, &num2);
    greatestOfThree(number1,num2);
}
void greatestOfThree(int a, int b)
{
    if(a>b)
    printf("a = %d is greatest\n", a);
    else if(b>a)
    printf("b = %d is the greatest \n", b);
    else
    printf("both are equal");
    
}