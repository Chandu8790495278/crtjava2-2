class  First
{
	void show(int x)
	{
	System.out.println("one arg int method");
	}
	void show(int x,int y)
	{
		System.out.println("two arg int method");
	}
	void show(double d)
	{
		System.out.println("one arg double method");
	}
}
class Test
{
	public static void main(String args[])
	{
		First f1=new First();
		f1.show(46.6);
		f1.show(34,78);
		f1.show(66);
	}
}




