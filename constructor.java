// Before compilation
class sample
{
	void Main()
	{
		System.out.println("m1 method");
	}
	public ststic void main(String[] args)
	{
		sample s1=new sample(11);
		s1.m1();
	}
}
//Aftre compilation
class sample
{
	void  main()
	{
    System.out.println("m1 method");
	}
	sample ()
	{ }
   public ststic void main(String[] args)
	{
    sample s1=new sample(11);
	s1.m1();
	}



	
//Before compilation
class Main
{
	void Main()
	{
		System.out.println("m1 method");
	}
	public static void main(String[] args)
	{
		sample s1=new sample(11);
		s1.m1();
	}
}
//After compilation

class sample
{
	void  Main()
	{
    System.out.println("m1 method");
	    
	}
	
	Main()
	{  }
   public static void main(String[] args)
	{
    sample s1=new sample(11);
	s1.m1();
	}
}



	
	
	
