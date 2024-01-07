	
	class student
{
int admno;
String name;


void get(int admno,String name)
	{
		this.admno=admno;
		this.name=name;
	}
	void show()
	{
		System.out.println("Addition no="+admno);
		System.out.println("Name="+name);
	}
}
class marks extends student
	{
	int mat,phy,che;
	void getmarks(int mat,int phy,int che)
		{
		this.mat=mat;
		this.phy=phy;
		this.che=che;
		}
		void showMarks()
		{
			System.out.println("Maths="+mat);
            System.out.println("Physics="+phy);
	      System.out.println("Chemistry="+che);
            System.out.println("Total="+(mat+phy+che));
			System.out.println("Average="+(mat+phy+che)/3);
		}
		}
		class Main
		{
			public static void main(String args[])
			{
				marks m1=new marks();
				m1.get(111,"rrr");
				m1.getmarks(88,56,68);
				m1.show();
				m1.showMarks();
			}
		}
	

					
									
				

		 
		       
	