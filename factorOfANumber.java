import java.util.Scanner;
public class factorOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        findFactors(num);
    }
    //method - takes input as number, prints all the factors
    static void findFactors(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
               System.out.print(i+" ");
    
        }
        
    }
}

    