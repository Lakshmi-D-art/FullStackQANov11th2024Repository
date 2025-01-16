class CountOfPrime50To100
{
    public static void main(String args[])
    {
       int count=0;
           for(int i=50;i<=100;i++)
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
              count=count+1;
          }
        }
      System.out.println("Count of Prime Numbers between 1to 5o are :"+count);
    }
}


 