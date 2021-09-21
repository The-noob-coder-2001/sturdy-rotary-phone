import java.util.*;
public class maximizeModulo {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Running....");
        int tc = sc.nextInt();
        System.out.println( maximizeModulus(tc));
    }
    static int maximizeModulus(int tc)
    {
        Scanner sc = new Scanner(System.in);    
        while(tc>=1)
        {
            int m = sc.nextInt(); //length of the string.
            int k = sc.nextInt(); // the number to check modulo with.
            int num[] = new int[m];
            for(int i=0;i<m;i++)
            {
                num[i] = sc.nextInt(); // enters all array elements into num[]
            }
            // now we need to convert array to number.
            StringBuilder s = new StringBuilder(); 

            for (int i : num)
            {
                s.append(i); //add all the ints to a string
            }
            
            int number = lastDigitRemoval(Integer.parseInt(s.toString()));
            
            return (number%k);



        }
        return 0;
    }
    static int lastDigitRemoval(int num)
    {
        int rem = num%10;
        num=num-rem;
        num=num/10;
        return num;
    }
}