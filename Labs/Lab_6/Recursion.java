public class Recursion
{
    int sum (int n)
    {
        if (n == 0)
            return n;
        else
            return n + sum(n-1);
    }

    int factorial(int n)
    {
        if( n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }

    long powerOf10(int n)
    {
        if (n==0)
            return 1;
        else
            return 10 * powerOf10(n-1);
    }

    long powerOfN(int x, int p)
    {
        if(p == 0)
            return 1;
        if(p == 1)
            return x;
        else
            return x * powerOfN(x, p-1);
    }

    int bunnyEars(int n)
    {
        if(n==0)
            return n;
        else
            return 2 + bunnyEars(n-1);
    }

    public static void main(String[] args)
    {
        Recursion recursion = new Recursion();
        System.out.println(recursion.sum(10));
        System.out.println(recursion.factorial(15));
        System.out.println(recursion.powerOf10(20));
        System.out.println(recursion.powerOfN(5,10));
        System.out.println(recursion.bunnyEars(100));
    }
}