import java.util.Scanner;

public class IncresingNumberRowWise
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the integer::");
        int n= input.nextInt();
        int num =1;
        for (int i = 1; i <=n; i++)
        {
            for (int j = 1; j <=n; j++)
            {
                System.out.print(num +" ");
                num++;
            }
            System.out.println("");
        }
    }
}
