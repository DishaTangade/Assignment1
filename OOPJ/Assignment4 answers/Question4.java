import java.util.Scanner;
class EqualMatrix
{
    public static void main(String[] args)
    {   
        Scanner sc=new Scanner(System.in);
        int[][] matrix1=new int[2][2];
        int[][] matrix2=new int[2][2];
        System.out.println("Enter elements in matrix1");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            { 
             matrix1[i][j]=sc.nextInt();
            
            }
        }
        System.out.println("Enter elements in matrix2");
          for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            { 
             matrix2[i][j]=sc.nextInt();
            
            }
       }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(matrix1[i][j]==matrix2[i][j]){
                    System.out.println("Matrices are equal");
                }
                else
                {
                   System.out.println("Matrices are not equal");
                }
            }
        }
    }
}