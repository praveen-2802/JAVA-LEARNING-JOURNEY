public class Pattternprint
{
    public static void main(String[] args)
    {
        first();
        secound();
        third();
    }
    public static void first()
    {
        int a= 0;
        while (a<5)
        {
            System.out.print("*");
            int b = 0;
            while (b < a) {
                System.out.print(" *");
                b++;
            }
            a++;
            System.out.println("");
        }
    }
    public static void secound()
    {
        int a = 0;
        while (a < 5) {
            System.out.print("*");
            int b = 4;
            while (b > a) {
                System.out.print(" *");
                b--;
                ;
            }
            a++;
            System.out.println("");
        }
    }
    public static void third()
    {
        int a=0;
        while(a<5)
        {
            int space = 4;
            while (space > a)
            {
                System.out.print(" ");
                space--;
            }
            int b = 0;
            while (b<=a)
            {
                System.out.print("*");
                b++;
            }
            System.out.println("");
            a++;
        }
    }
}
