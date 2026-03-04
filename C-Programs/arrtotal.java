class arrtotal
{
    public static void main(String args[])
    {
        int a[]={200,100,50,20};
        int quantity[]={2,3,4,5};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+(a[i]*quantity[i]);
        }
        System.out.println("Total is "+sum);
    }
}