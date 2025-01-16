class SumOfFibonacciForLoop
{
    public static void main(String args[])
    {   
        int sum=0;
        int fn=0;
        int sn=1;
        for(int i=1;i<=18;i++)
        {
          int tn=fn+sn;
          fn=sn;
          sn=tn;
          sum=sum+tn;
        }
        System.out.println("Sum :"+sum);
    }
}