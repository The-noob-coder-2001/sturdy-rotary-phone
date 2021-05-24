/**
 * Algo: 
 * input binary digit
 * convert to decimal
 * use that decimal for conversion of binary to octal
 * make a method to find octal which accepts decimal as input argument.
 * iterate till decimal!=0
 * update octal by decimal%8 * power of 10;
 * update decimal by decimal=decimal/8;
 * return octal
 */
import java.util.Scanner;
import java.lang.Math;
public class binary_to_octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in binary to convert into octal");
        int binary = sc.nextInt();
        binary_to_decimal obj = new binary_to_decimal();
        int newdecimal = obj.binaryToDecimal(binary);
        System.out.println("Octal number for the entered binary number is : "+binaryToOctal(newdecimal));
        
    }
    static int binaryToOctal(int n)
    {
        int octal=0, i=1;
       while(n!=0)
       {
        octal += (n%8) *i;
        n=n/8;
        i=i*10;

       }
        return octal;
    }
   
}
