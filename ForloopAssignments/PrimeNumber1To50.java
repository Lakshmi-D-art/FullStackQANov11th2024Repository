class PrimeNumber1To50
{
    public static void main(String args[])
    {
        for(int i=1;i<=50;i++)
        {
          int look=0;
          for(int n=2;n<i;n++)
          {
              if (i%n==0)
              {
                  look=look+1;
                  break;
              }
          }
         if(look==0)
         {
                  System.out.println(i);
         }
       }
    }
}
