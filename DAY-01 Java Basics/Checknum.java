import java.util.Scanner;

public class Checknum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num you wanna check:");
        float a = input.nextFloat();
         if ( a>0){
             System.out.println("The num is postive");
         } else if (a==0) {
             System.out.println("The num is zero");
         } else
         {
             System.out.println("The number is negative");
         }
    }
}
