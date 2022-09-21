//ID : 21CE121 
//Name : Prasan Savaliya 
//Aim : WAP to show the try - catch block to catch the different types of exception. 
public class Prac_1 
{
    public static void main(String[] args)
    {
        try 
        { 
            int divideByZero = 5/0; 
        }
        catch (ArithmeticException e) 
        { 
            System.out.println("Can't divide by zero "); 
        }
        System.out.println("21CE121_Prasan");
    }
}
