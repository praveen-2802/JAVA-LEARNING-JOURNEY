import java.util.Scanner;

public class InputOutput
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Size:");
       int n= input.nextInt();
       int[] num=new int[n];
        for (int i = 0; i < n; i++)
        {
            num[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            System.out.println(num[i]);
        }
    }
}