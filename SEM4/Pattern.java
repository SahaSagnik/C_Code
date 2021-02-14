public class Pattern
{
    public static void main(String[] args)
    {
        for (int row=0; row<=3; row++)
        {
            for(int sp=3; sp>row; sp--)
            {
                System.out.print(" ");
            }
            for(int c=row; c>0; c--)
            {
                System.out.print(c);
            }
            for(int col=0; col<=row; col++)
            {
                System.out.print(col);
            }
            System.out.println("");
        }
    }
}