import java.io.* ;

public class Calculator
{   
    private static void Calculate(String expr) 
    {
        int N = expr.length();
        char[] a = expr.toCharArray();  // store expression in an character array
        for (int i=0; i<N; i++)
        {
            Character c = a[i];
            // check next character c
            
            /* enter your code! */
        }
    }
    
    public static void main(String[] args)
    {
        String expr = args[0];
        System.out.println("Input expression = " + expr + " , length = " + expr.length());
                
        Calculate(expr);
    }
}
