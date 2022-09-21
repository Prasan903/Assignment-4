//ID : 21CE121
//Name : Savaliya Prasan 
/* Aim: Write a program that raises two exceptions. 
        Specify two ‘catch’ clauses for the two exceptions. 
        Each ‘catch’ block handles a different type of exception.
        For example the exception could be ‘ArithmeticException’
        and ‘ArrayIndexOutOfBoundsException’. Display a message 
        in the ‘finally’ block.*/ 
  
import java.util.*; 
public class Prac_3 
{ 
    public static void main(String[] args) 
    { 
        try 
        { 
            System.out.println("Enter the two num:"); 
            Scanner sc=new Scanner(System.in); 
            int no1=sc.nextInt(); 
            int no2=sc.nextInt(); 
            System.out.println("no1:"+no1+" no2:"+no2); 
        } 
        catch(InputMismatchException e) 
        { 
            System.out.println("Error Name :" +e); 
        } 
        try 
        { 
            String str_a="Prasan"; 
            int b=str_a.charAt(19); 
            System.out.println("b:"+b); 
        } 
        catch(StringIndexOutOfBoundsException e) 
        { 
            System.out.println("\n\nError Name :"+e); 
        }
        finally 
        { 
            System.out.println("\n\nExecuting the finally block"); 
        }
    }
}