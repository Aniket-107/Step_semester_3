import java.util.Scanner;

class NaturalSum
{
    void sumOfNaturalNumbers(int n)
    {
        int i = 1;
        int sum = 0;

        while(i <= n)
        {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        NaturalSum obj = new NaturalSum();
        obj.sumOfNaturalNumbers(n);
    }
}