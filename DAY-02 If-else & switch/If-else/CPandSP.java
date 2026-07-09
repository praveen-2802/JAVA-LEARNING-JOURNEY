import java.util.Scanner;

public class CPandSP
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Cost Price:");
        int cp = input.nextInt();
        System.out.print("Enter the Selling price:");
        int sp = input.nextInt();
        float total= sp-cp;
        if (sp>cp)
        {
            System.out.println(total+" is profit");
        } else if (sp==cp)
        {
            System.out.println("There's no profit and no loss");
        }  else {
            System.out.println(-(total)+" is loss");
        }
    }
}
