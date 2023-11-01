import java.io.* ;

public class Calculator
{   
    private static void Calculate(String expr) 
    {
        Stack<Integer> intStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();
        int  x;
        int N = expr.length();
        char[] a = expr.toCharArray();  // store expression in an character array
        for (int i=0; i<N; i++)
        {
            Character c = a[i];
            // check next character c
            //If it is an int
            if(a[i] >= '0' && a[i] <= '9'){
                x = 0;
                while(a[i] >= '0' && a[i] <= '9'){
                    x = 10 * x + (a[i++] - '0');
                }
                intStack.push(x);
                System.out.println(x);

            //If it is + - or x
            }else if((c == '+') || (c == '-') || (c == '*')){
                System.out.println(c);
                charStack.push(c);

            //If it is )
            }else if(c == ')'){
                char k = charStack.pop();
                int m = intStack.pop();
                int n = intStack.pop();
                int result = 0;

                if(k == '+'){
                    result = m + n;
                }else if(k == '-'){
                    result = n - m;
                }else{
                    result = m * n;
                }
                intStack.push(result);
                
            //If it is (
            }else{
                continue;
            }
        }
    }
    
    public static void main(String[] args)
    {
        String expr = args[0];
        System.out.println("Input expression = " + expr + " , length = " + expr.length());
                
        Calculate(expr);
    }
}
