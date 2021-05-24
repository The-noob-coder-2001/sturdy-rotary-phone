import java.util.Scanner; 
public class automorphic_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check that it is an automorphic number or not..");
        int n = sc.nextInt();
        if(isAutomorphic(n))
        {
            System.out.println("The number entered is an automorphic number");
        }
        else{
            System.out.println("the number entered is not an automorphic number");
        }
    }
    static boolean isAutomorphic(int n)
    {
        int square = n*n;
        int rem = 0, rem1;
        while(n!=0)
        {
            rem=n%10;   // 0 -  
            rem1=square%10; // 0 - 100
            if(rem!=rem1)
                return false;
            
            n=n/10;
            square=square/10;

        }
        return true;
    }
}
