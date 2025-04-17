import maths.Multiply;
import maths.Sum;

public class Test {

    public static void main(String[] args) {
        
        int age = 21;
        String name = "Aman Kumar";

        checkValidity(name, age);

        checkEvenOdd(16);

        checkPrime(17);

        checkPositiveNegativeNeutral(-1);
    }

    static void checkValidity(String name, int age)
    {
        if(age > 17)
        {
            System.out.println(name+" is valid candidate");
        }
        else{
            System.out.println(name+" is not a valid candidate");
        }
    }

    static void checkEvenOdd(int n)
    {
        if(n%2==0) 
        System.out.println(n+" is Even");
        else 
        System.out.println(n+ " is odd");
    }

    static void checkPrime(int n)
    {
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }

        if(count==2)
        {
            System.out.println(n+" is a prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }
    }

    static void checkPositiveNegativeNeutral(int n)
    {
        if(n>0) System.out.println(n+" is positive");
        else if(n<0) System.out.println(n+" is negative");
        else System.out.println(n+" is neutral");
    }

    
}