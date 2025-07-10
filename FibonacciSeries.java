public class Main
{
public static int Fibonacci(int n)  
{
    if(n==0|| n==1)
    {
        return 1;
    }
    return n*Fibonacci(n-1);
}
public static void main(String[] args)
{
  int n=5;
  System.out.print(Fibonacci(n));
}
}
