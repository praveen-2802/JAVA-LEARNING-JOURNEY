import java.util.Scanner;

public class fahrenheittocelsius
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fahrenheit:");
        float f = input.nextFloat();
        double c = (f-32)*5/9;
        System.out.println("celsius is:"+c);

    }
}
