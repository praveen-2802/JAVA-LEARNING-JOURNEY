import java.util.Scanner;

public class Checktriangle
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the A-Angle:");
        int aa = input.nextInt();
        System.out.print("Enter the B-Angle:");
        int ba = input.nextInt();
        System.out.print("Enter the C-Angle:");
        int ca = input.nextInt();
        if (aa<=0 ||ba<=0||ca<=0)
        {
            System.out.println("Triangle cannot be form enter valid angle");
        } else if (aa+ba+ca==180)
        {
            System.out.println("Yes its a triangle");
        }else
        {
            System.out.println("Traingle can't form ");
        }

    }
}
