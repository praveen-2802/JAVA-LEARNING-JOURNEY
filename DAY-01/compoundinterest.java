import java.util.Scanner;

public class compoundinterest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Rate of interest:");
        float r = input.nextFloat();
        System.out.print("Enter Principal:");
        float pr = input.nextFloat();
        System.out.print("Enter Time:");
        float t = input.nextFloat();
        double ci= pr* Math.pow((1+r/100),t);
        System.out.println("The compound intrest is:"+ci);

    }
}
