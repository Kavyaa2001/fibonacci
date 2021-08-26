package Mycap;
import java.util.*;

public class fibonacci
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = in.nextInt();
        int a=0, b=1, sum=0, c=2;
        System.out.print(a);
        System.out.print("\t" +b);
        while(c<=n)
        {
            sum = a + b;
            c++;
            System.out.print("\t" + sum);
            a = b;
            b = sum;
        }
    }
}
