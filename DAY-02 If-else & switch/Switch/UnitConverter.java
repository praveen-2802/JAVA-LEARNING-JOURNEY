import java.lang.classfile.attribute.RuntimeInvisibleTypeAnnotationsAttribute;
import java.util.Scanner;

public class UnitConverter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for Celsius to Fahrenheit:");
        System.out.println("Enter 2 for Fahrenheit to Celsius");
        System.out.println("Enter 3 for Kilometers to Meter");
        System.out.println("Enter 4 for Meter to Kilometer");
        System.out.print("Enter the num:");
        int unit2 = input.nextInt();
        System.out.print("Enter the value to convert:");
        float unit = input.nextFloat();
        switch (unit2)
        {
            case 1:
                System.out.println(9.0/5*unit+32+" Fahrenheit");
                break;
            case 2:
                System.out.println(5.0/9*(unit-32)+" Celsius");
                break;
            case 3:
                System.out.println(unit*1000+" Meters");
                break;
            case 4:
                System.out.println(unit/1000+" Kilometers");
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}
