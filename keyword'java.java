class student 
{
	int admno;
	String name;
	void get (int admno,String name)
	{
		this.admno=admno
		this.name=name
	}
	void show()
	{
		System.out.println("Admno="+admno+"Name="+name);
	}

}
public Static void main (String[] args)
{
	student s1=new student();
	s1.get(222,"rrr");
	s1.show();
	student s2=new student();
	s2.get(666,"kkk");
	s2.show();
}
}






	
	
	
