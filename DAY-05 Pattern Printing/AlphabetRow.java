import java.util.Scanner;

public class AlphabetRow
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the Num::");
        int n= input.nextInt();
        for (int i = 1; i <=n; i++)
        {
            char ch='A';
            for (int j = 0; j <=n; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println("");
        }
    }
}
