class CountDivisibleBy5And10And15
{
    public static void main(String args[])
    {
        int count=0;
        for(int i=1;i<=500;i++)
        {
            if((i%5==0) && (i%10==0) && (i%15==0))
            {
                 count=count+1;
            }
        }
         System.out.println("# of Numbers which are divisible by 5,10,15:"+count);
      }
}