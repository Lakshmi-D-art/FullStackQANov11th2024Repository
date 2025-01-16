class SumPrimeNumBet1to100
{
    public static void main(String args[])
    {
        int sum=0;
        for(int i=1;i<=100;i++)
        {
            int look=0;
            for(int k=2;k*k<=i;k++)
            {
               if(i%k==0)
                  {
                      look=look+1;
                      break;
                  }
           }
                       if(look==0)
                      {
                           sum=sum+i;
                      }
              }
            System.out.println("Sum of Prime Numbers bet 1 to 100 :"+sum);
        }
}