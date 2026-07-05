import java.util.Scanner;

public class Evenoddbitwise
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num you wanna check:");
        int a = input.nextInt();
        if ((a&1)==0 ){
            System.out.println("The num is even");
        } else {
            System.out.println("The num is odd");
        }
    }
}
