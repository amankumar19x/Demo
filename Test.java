public class Test {

    public static void main(String[] args) {
        
        int age = 21;
        String name = "Aman Kumar";

        checkValidity(name, age);
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
}