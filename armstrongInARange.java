import java.util.Scanner;
public class armstrongInARange extends armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end;
        System.out.println("Please ente the start and the end numbers");
        start = sc.nextInt(); end = sc.nextInt();
        System.out.println("The armstrong numbers from "+start+" to "+end+":");
       for(int i=start;i<=end;i++)
       {
           if(armstrong.checkArmstrongNumber(i))
                System.out.print(i+ " ");
       }
    
    }
}
