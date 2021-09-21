/**
 * 3 3 3 3 3 
 * 3 2 2 2 3 
 * 3 2 1 2 3 
 * 3 2 2 2 3 
 * 3 3 3 3 3
 */
public class patttern {

    public static void main(String[] args) {
        int n = 5;
        int m = 2 * n - 1;
        int a = m/2;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                
            //? if no of columns are even then,  we cannot put 1 at the middle, else put 1.
                if (j >=1 && j<=m-2 && i >= 1 && i <= m-2)
                    System.out.print(2 + " ");
                
                if(j==(m-a) && )
                    {
                        System.out.print(1+" ");
                    }
               
                else
                    System.out.print(3 + " ");
            }

            System.out.println();
        }
    }
}