class SimpleIntrest
{
    int t=4;
    double p=100;
    double r=5;
    double si;
    public static void main(String args[])
    {
        SimpleIntrest obj=new SimpleIntrest();
        obj.si=obj.p*obj.r*obj.t/100;
        System.out.println("Simple intrest"+obj.si);
    }
}