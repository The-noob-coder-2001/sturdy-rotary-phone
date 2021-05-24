#include<stdio.h>
int findArmstrong(int);
int main()
{
    int start, end, result;
    printf("Please enter the starting number: \n");
    scanf("%d", &start);

    printf("Enter the ending element : \n");
    scanf("%d", &end);

    printf("these are the armstrong numbers:");
    for( int i=start; i<end; i++)
    {
        result = findArmstrong(i);
        printf("%d\n", result);
    }

}
int findArmstrong(int num)
{
    int remainder, sum=0, temp;
    temp=num;
    while(num!=0)
    {
        remainder = num%10;
        sum = sum + (remainder*remainder*remainder);
        num=num/10;
    }
    if(temp==sum)
    {
        return sum;
    }
}