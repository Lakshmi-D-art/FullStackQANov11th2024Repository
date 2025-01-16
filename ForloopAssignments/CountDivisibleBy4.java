

class CountDivisibleBy11
{
    public static void main(String args[])
    {
        int count=0;
        for(int i=200;i>=100;i--)
        {
           if(i%11==0)
           {
               count=count+1;
           }
        }
        System.out.println("#Count of numbers divisible by 11:"+count);
     }
}