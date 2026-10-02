import java.util.*;
class Problem_7
{
    public static int reverse(int x) 
    {
        int d, t = x, rev = 0;
        if (x != 0)
        {
            while (t != 0)
            {
                d = t % 10;
                if (rev > (Integer.MAX_VALUE / 10) || rev < (Integer.MIN_VALUE / 10))
                {
                    return 0;
                }
                rev = rev * 10 + d;
                t /= 10;
            }
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(reverse(x));
        sc.close();
    }
}