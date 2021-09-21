/**
 * 2 2 2
 * 2 1 2
 * 2 2 2
 */
public class patttern_2 {
    public static void main(String[] args) {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==1&&j==1)
                {
                    System.out.print(1+" ");
                }
                else
                    System.out.print(2+" ");
            }
            System.out.println();
        }
    }
}
