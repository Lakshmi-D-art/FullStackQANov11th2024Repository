class SumOfCubeMinusSquare
{
    public static void main(String args[])
    {
        int sum=0;
        for (int i=20;i>=10;i--)
        sum+=((i*i*i)-(i*i));
    {
        System.out.println("Sum:"+sum);
    }
   }
}