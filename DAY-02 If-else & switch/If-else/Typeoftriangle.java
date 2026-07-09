import java.util.Scanner;

public class Typeoftriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the A-Angle:");
        int aa = input.nextInt();
        System.out.print("Enter the B-Angle:");
        int ba = input.nextInt();
        System.out.print("Enter the C-Angle:");
        int ca = input.nextInt();
        if (aa > 0 && ba > 0 && ca > 0 && aa+ba+ca==180)
        {
            if (aa==60&&ba==60&&ca==60)
            {
                System.out.println("It's a Equilateral triangle");
            } else if (aa == ba || ba == ca || ca == aa)
            {
                System.out.println("It's a Isosceles triangle");
            } else {
                System.out.println("It's an scalene Traingle");
            }
        } else
        {
            System.out.println("The points are invalid and can't form an triangle");
        }
    }
}


