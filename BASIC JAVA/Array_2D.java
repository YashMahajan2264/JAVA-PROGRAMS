public class Array_2D 
{
    public static void main(String[] args) 
    {
        int[][] a= new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=j;
            }
        }
        System.out.println("The array element is: ");
        for(int c[]:a)
        {
            for(int d:c)
            {
                System.out.print(d + " ");
            }
            System.out.println();
        }
        
    }
    
}
