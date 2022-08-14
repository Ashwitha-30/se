class facto
{
	int num;
void getdata(int n)
{
	num=n;
}
int fact()
{
	int fac=1;
	for(int i=1;i<=num;i++)
	fac=fac*i;
	return fac;
}
}
class f
{
	public static void main(String args[])
	{
	facto f1=new facto();
	f1.getdata(4);
	int t=f1.fact();
	System.out.println(t);
}
}