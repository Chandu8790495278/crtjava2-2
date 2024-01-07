	
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
            
		}
		}
		class result extends marks
		{
			void show result()
			{

		{
			System.out.println("Total="(mat+phy+che));
            System.out.println("Average="+(mat+phy+che)/3);
		}
			}
			class single
			{
			}
		
		
			public static void main(String args[])
			{
				result r1=new result();
				r1.get(111,"rrr");
				r1.show();
				r1.showMarks();
				r1.show result();
			}
		}
	

					
									
				

		 
		       
	