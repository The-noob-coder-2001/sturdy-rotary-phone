import java.util.Scanner;
public class HCF
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers for which you want to find the HCF");
        int a = sc.nextInt(); int b = sc.nextInt();
        System.out.println("The HCF of 2 numbers entered are: "+findHCF(a, b));

    }
    static int findHCF(int a, int b)
    {
        while(b!=0)
       { if(a>b)
            a= a-b;
        else
            b=b-a;}
        
        return a;
    }
}