import java.util.Scanner;

public class oddeven
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num you wanna check:");
        float a = input.nextFloat();
        if (a % 2 ==0){
            System.out.println("The num is even");
        } else {
            System.out.println("The num is odd");
        }

    }
}
