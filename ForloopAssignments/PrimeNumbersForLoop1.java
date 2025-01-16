class PrimeNumbersForLoop1
{
    public static void main(String args[])
    {  
       int num=0;
       int i=0;
       int look=0;
       for(i=2;i<=100;i++)
       {
        if(num % i==0)
        {
            look=look+1;
            break;
        }
       }
     System.out.println(i);
    }
}
       