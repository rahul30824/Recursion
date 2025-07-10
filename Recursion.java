class Main
{
public static int Solution(int n)    
{
    if(i==0)
    {
      return 0;  
    }
    if(i==1)
    {
        return 1;
    }
    else
    {
        return Solution(i-2)+Solution(i-1);
    }
}
public static void main(String[] args)
{
    int n=10;
    int i=0;
    Solution(n,i);
}
}
