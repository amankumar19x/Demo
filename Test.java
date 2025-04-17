import maths.Multiply;
import maths.Sum;

public class Test {

    public static void main(String[] args) {
        
        int age = 21;
        String name = "Aman Kumar";

        checkValidity(name, age);

        Sum sum = new Sum(12,3);
        Multiply multiply = new Multiply(3, 9);

        System.out.println("Sum = "+sum.getSum());
        System.out.println("Multiply = "+multiply.getMult());

        checkEvenOdd(16);
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
}