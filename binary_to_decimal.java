/**
 * Logic: 
 * 1st break the numb er into digits one by one
 * then hold a counter to count the digit positions. Assign it with -1 previously
 * make a variable decimal and store the value of rem*2^(count)
 */

import java.util.Scanner;
public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number in binary!");
        int binary = sc.nextInt();
        int decimal = binaryToDecimal(binary);
        System.out.println("decimal of "+binary+" is : "+decimal);
      
    }
    static int binaryToDecimal(int n)
    {
        int decimal=0, count=-1, rem=0;
        while(n>0)
        {
            rem=n%10;
            count++;
            decimal = decimal + rem*power(count);
            n=n/10;
        }
        return decimal;
    }
    static int power(int num)
    {
        int pro=1;
        for(int i=1; i<=num; i++)
        {
             pro = pro*2;
        }
        return pro;
    }
}
