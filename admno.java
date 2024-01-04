class Main
{	
	int admno;
	String name;
	void get (int x, String y)
	{
	 admno=x;
	  name=y;
	}
	void show()
	{
		System.out.println("Admission no="+admno+"Name"+name);
	}
}
class Test 
{
    public static void main(String[] args)
    {
        Main s1=new Main();
        s1.get(111,"rrr");
        s1.show();
        Main s2=new Main();
        s2.get(222,"kkk");
        s2.show();
    }
}
        
        
        
        
    

	
	
	
		


	

	
	
