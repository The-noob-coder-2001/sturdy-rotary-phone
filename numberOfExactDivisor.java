// find number of integers which have X divisors
//main question: out of 1 to 100, which of the numbers have exactly 9 divisors?
//import java.util.Scanner;
public class numberOfExactDivisor {
    public static void main(String[] args) {
      int n=100;
      findDivisors(n);


    }
    static int findDivisors(int range)
    {
        int count=0;
        int no_of_divisors=0;
        for(int i=1;i<=range;i++)
        {
            if(i%range==0)
                no_of_divisors++;
        }
        if()
        return count;
    }
}
