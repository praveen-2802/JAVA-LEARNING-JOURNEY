import java.util.Scanner;

public class CountVowel
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Characters: ");
        char[] ch= new char[n];
        for(int i=0;i< ch.length;i++)
        {
            ch[i] = sc.next().charAt(0);
        }
        int count = 0;
        for (int i = 0; i < ch.length; i++)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'|| ch[i]=='u'||
                    ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
            {
                count++;
            }
        }
        System.out.println("Total Vowels = "+count);
    }
}
