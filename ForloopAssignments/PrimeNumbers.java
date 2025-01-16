class PrimeNumbers
{
    public static void main(String args[])
    {   
        int num=Integer.parseInt(args[0]);
        int look=0;
        for(int i=2;i<num;i++)
        {
           if(num%i==0)
           {
               look=look+1;
               break;
           }
         }
         if(look==0)
       {
        System.out.println(num+" a Prime Number");
       }
        else
       {
         System.out.println(num+" is not a Prime Number");
       }
    }
}