import java.util.Scanner;

public class Even
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the N:");
        int n =input.nextInt();
        even(n);
    }
    public static void even(int n)
    {

        //for (int i = n%2; i==0 ; i++)
       // {
          //  System.out.println(i);
        //}
        int x= 2;
        while (x<=n)
        {
            System.out.println(x+2);
            x+=2;
        }
    }
}
