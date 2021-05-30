import java.util.Scanner;
public class print2DArraySpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int rows = sc.nextInt(); int cols = sc.nextInt();
        System.out.println("Enter data into the matrix : ");
        int matrix[][] = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        printMatrix(matrix, rows, cols);
       spiralMatrix(matrix, rows, cols);
    }
    static void printMatrix(int arr[][], int rows, int cols)
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static void spiralMatrix(int matrix[][], int rows, int cols)
    {
        int left=0 , right=cols-1, top=0, bottom=rows-1;
        int direction = 0;
        /**
         * when direction is :
         *  0 : left to right
         *  1 : top to bottom
         *  2 : right to left
         *  3 : bottom to top
         */
        while(left<=right && top<=bottom){if(direction==0) // print the array elements from left to right
        {
            for(int i=left;i<=right;i++)
            {
                System.out.print(" , "+matrix[top][i]);
            }
            top++; // update top value such that it gets to the second row.
            direction = 1; //now we should go top to bottom
        }
        else if(direction==1) // print the array elements from top to bottom
        {
            for(int j=top;j<=bottom;j++)
            {
                System.out.print(" , "+matrix[j][right]);
            }
            right--; //decrement right value to update its position into previous column.
            direction=2;
        }
        else if(direction==2) // print the array from right to left.
        {
            for(int k=right; k>=left; k--)
            {
                System.out.print(" , "+matrix[bottom][k]);
            }
            bottom--; // decrement the bottom value to previous row.
            direction=3;
        }
        else if(direction==3) // print the array from bottom to top.
        {
            for(int l=bottom;l>=top;l--)
            {
                System.out.print(" , "+matrix[l][left]); 
            }
            left++; //increment left value to next column.
        }

}
    }
}
