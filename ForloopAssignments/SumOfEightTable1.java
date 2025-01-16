class SumOfEightTable1
{
    public static void main(String args[])
    {
     int sum=0;
     for(int i=8;i<=80;i++)
      {
        if(i%8==0)
        { 
           sum=sum+i;
       }
      }
        System.out.println("Sum:"+sum);
    }
}