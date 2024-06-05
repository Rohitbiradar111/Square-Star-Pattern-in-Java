//This program prints a Square Star Pattern in Java

public class SquarePattern {
    public static void main(String args[])
    {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}