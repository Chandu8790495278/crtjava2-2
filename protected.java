// First.java
Package pack1;
class first
{
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	void show1()
	{
		System.out.println("private a="+a);
        System.out.println("default b="+b);
		System.out.println("protected c="+c);
		System.out.println("public d="+d);
	}
	public static void main(String args[])
	{
		First f1=new First();
		f1.show();
	}
}


