public class decimal_to_binary {
    public static void main(String[] args) {
        int decimal = 1;
        System.out.println(check(decimal));
    }
    static int check(int decimal)
    {
        int rem1=0,rem2=0, res=0;
      
           rem1= decimal%2;
           rem2 = decimal%5;
           if(rem1==1){
               while(decimal>0)
               {
                   decimal = decimal/2;
                   res = res + decimal;
               }
           }
           else if(rem2==1){
            while(decimal>0)
            {
                decimal = decimal/5;
                res = res + decimal;
            }
        }
        return res;
            
        
    }
    // static int divideUntil(int n, int d) 
    // {
    //     int binary=0;
    //     while(n>0)
    //     {
    //         binary = binary+d%n;
    //     }
    //     return binary;
    // }   
}
