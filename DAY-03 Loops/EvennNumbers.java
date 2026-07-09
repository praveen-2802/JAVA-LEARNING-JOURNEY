import java.util.Scanner;

public class EvennNumbers 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enteer the integer:");
        int e= input.nextInt();
        int x=2;
        while (x<=e)
        {
            System.out.println(x+2);
            x+=2;
        }
        
    }
}
